package Collection;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSample {
    public static void main(String[] args) {
        LinkedList<String> bookList = new LinkedList<>();
        bookList.add("龙族1");
        bookList.addFirst("江南");
        bookList.addLast("龙族2");
        System.out.println(bookList);

        List<String> countryList = new ArrayList<>();
        countryList.add("CH");
        countryList.add("MY");
        countryList.add("SG");
        countryList.add("AU");
        for (String country:countryList) {
            System.out.println(country);
        }
        System.out.println("===================");
        countryList.forEach(country->{
            System.out.println(country);
        });
    }
}
