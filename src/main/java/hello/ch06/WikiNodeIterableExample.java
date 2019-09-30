package hello.ch06;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * 按照书中内容，结合现有代码，补充代码中缺失的内容。
 *
 * @author lewis
 */
public class WikiNodeIterableExample {

    public static void main(String[] args) throws IOException {

        String dirname = System.getProperty("user.dir");
        String filename = "src/main/resources/en.wikipedia.org/wiki/Java_(programming_language)";
        String baseURI = dirname + "/" + filename;

        File input = new File(baseURI);
        Document doc = Jsoup.parse(input, "UTF-8", baseURI);

        Element content = doc.getElementById("mw-content-text");
        Elements paragraphs = content.getElementsByTag("p");
        Element firstPara = paragraphs.get(0);

        Iterable<Node> iter = new WikiNodeIterable(firstPara);
        for (Node node : iter) {
            if (node instanceof TextNode) {
                System.out.print(node);
            }
        }

    }

}
