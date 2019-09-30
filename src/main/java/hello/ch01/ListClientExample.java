package hello.ch01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author downey
 */
public class ListClientExample {

    private List<Integer> list;

    public ListClientExample() {
        list = new ArrayList<Integer>();
    }

    public List<Integer> getList() {
        return list;
    }

    public static void main(String[] args) {
        ListClientExample lce = new ListClientExample();
        List<Integer> list = lce.getList();
        System.out.println(list);
    }

}
