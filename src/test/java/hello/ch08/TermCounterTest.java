/**
 *
 */
package hello.ch08;

import hello.ch07.WikiFetcher;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author downey
 *
 */
public class TermCounterTest {

    private TermCounter counter;

    /**
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        String url = "https://en.wikipedia.org/wiki/Java_(programming_language)";

        WikiFetcher wf = new WikiFetcher();
        Elements paragraphs = wf.readWikipedia(url);

        counter = new TermCounter(url.toString());
        counter.processElements(paragraphs);
    }

    @Test
    public void testSize() {
        assertThat(counter.size(), is(4798));
    }

}
