package hello;

import org.junit.Before;

import java.util.ArrayList;

public class MyLinkedListTest extends MyArrayListTest {

    @Before
    public void setUp() throws Exception {
        list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        mylist = new MyLinkedList<Integer>();
        mylist.addAll(list);
    }

}
