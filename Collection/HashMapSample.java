package Collection;

import java.util.HashMap;

public class HashMapSample {
    public static void main(String[] args) {
        HashMap<String,Object> map= new HashMap<>();
        map.put("张三",1);
        map.put("李四",2);
        System.out.println(map);

        Integer w = (Integer) map.remove("张三");
        System.out.println(w);
    }
}
