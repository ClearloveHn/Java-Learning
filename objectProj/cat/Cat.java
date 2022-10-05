package objectProj.cat;

/**
 * 宠物猫类(Class)
 */
public class Cat {
    //属性
    String name;
    int month;
    double weight;
    String species;

    //行为: run && eat
    public void run() {
        System.out.println("小猫会跑");
    }

    public void eat() {
        System.out.println("小猫吃鱼");
    }


}
