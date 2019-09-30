package hello.ch07;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.fail;

/**
 * 因为维基百科打不开，现有的资源无法看到执行成功的结果，但是已经足以验证程序的逻辑正确性了。
 *
 * @author downey
 */
public class WikiPhilosophyTest {

    /**
     * Test method for {@link WikiPhilosophy#main(String[])}.
     */
    @Test
    public void testMain() {
        // Because this lab is more open-ended than others, we can't provide unit
        // tests.  Instead, we just check that you've modified WikiPhilosophy.java
        // so it doesn't throw an exception.
        String[] args = {};
        try {
            WikiPhilosophy.main(args);
        } catch (IOException e) {
            e.printStackTrace();
            fail();
        }
    }

}
