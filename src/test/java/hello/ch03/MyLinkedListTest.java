package hello.ch03;

import hello.ch02.MyArrayListTest;
import org.junit.Before;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author downey
 */
public class MyLinkedListTest extends MyArrayListTest {

    @Before
    public void setUp() throws Exception {
        list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        mylist = new MyLinkedList<Integer>();
        mylist.addAll(list);
    }

}
