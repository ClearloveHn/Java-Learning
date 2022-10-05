package objectProj.monkey;

public class monkey {
    String name;
    String feature;

    public monkey() {
        System.out.println("我是使用无参构造产生的猴子");
    }

    public monkey(String name, String feature) {
        System.out.println("我是使用有参构造产生的猴子");
        this.name = name;
        this.feature = feature;

    }


}
