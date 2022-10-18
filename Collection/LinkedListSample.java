package Collection;

import java.util.LinkedList;

public class LinkedListSample {
    public static void main(String[] args) {
        LinkedList<String> bookList = new LinkedList<>();
        bookList.add("龙族1");
        bookList.addFirst("江南");
        bookList.addLast("龙族2");
        System.out.println(bookList);
    }
}
