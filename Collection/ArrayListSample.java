package Collection;

import java.util.ArrayList;

public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList<String> bookList = new ArrayList<>();
        bookList.add("三国演义");
        bookList.add("水浒传");
        System.out.println(bookList.get(0));
        String bookName = bookList.get(1);
        System.out.println(bookName);
        bookList.set(1,"西游记");
        System.out.println(bookList.get(1));
        bookList.remove(0);
        System.out.println(bookList);

        String item = bookList.remove(0);
        System.out.println(item);
        System.out.println(bookList);
    }
}
