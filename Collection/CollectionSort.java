package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 通过Collection实现集合排序
 */
public class CollectionSort {

    //重写comparator方法
    class SampleComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    }

    public List<Integer> sort (List<Integer> list) {
        Collections.sort(list,new SampleComparator());   //使用Collections.sort排序
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);

        CollectionSort collectionSort = new CollectionSort();
        list = collectionSort.sort(list);
        System.out.println(list);
    }
}
