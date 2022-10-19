package Collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSample {
    //自定义Comparator
    class IntegerCompare implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    }

    public void sort() {
        Set<Integer> set = new TreeSet<>(new IntegerCompare());
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(4);
        System.out.println(set);
    }

    public static void main(String[] args) {
        TreeSetSample treeSetSample = new TreeSetSample();
        treeSetSample.sort();

    }
}
