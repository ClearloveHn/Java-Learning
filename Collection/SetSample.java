package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetSample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        System.out.println(set);
        set.forEach(s -> {
            System.out.println(s);
        });
    }
}
