package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionUtils<E>{
    private List<E> data = new ArrayList<>();
    public void add(E element) {
        data.add(element);
    }

    public E randomSelect() {
      int index =  new Random().nextInt(data.size());
      E ret = data.get(index);
        return ret;
    }

    public static void main(String[] args) {
        CollectionUtils<String> utils = new CollectionUtils<>();
        utils.add("1");
        utils.add("2");
        utils.add("3");
        utils.add("4");

        String name = utils.randomSelect();
        System.out.println(name);
        System.out.println(utils.randomSelect());
        System.out.println(utils.randomSelect());
    }
}
