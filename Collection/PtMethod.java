package Collection;

import java.util.ArrayList;
import java.util.List;

public class PtMethod {
    public <T> List<T> transferToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T item : array) {
            list.add(item);
        }
        return list;
    }

    public static void main(String[] args) {
        PtMethod ptMethod = new PtMethod();
        String[] array = new  String[]{"1","2","3","4","5"};
        List<String> list = ptMethod.transferToList(array);
        System.out.println(list);
    }
}
