package objectProj.Car;

/**
 * 静态变量:
 * 1.属于整个类的,由类进行管理,通过类名和对象名两种方式进行访问。
 * 2.通过该类实例化的所有对象都共享类中的静态资源,任一对象信息的修订,都会影响全部对象。
 * 3.可以不用实例化对象访问
 *
 * 静态方法:
 * 1.同静态变量 1
 * 2.不允许在静态方法中访问本类中的非静态成员
 * 3.同静态变量3
 */

public class car {
    static String firm;
    String color;
    int price;

    public car(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public void display() {
        //1.类内静态成员访问:类名+静态成员名
        System.out.println(car.firm + this.color + this.price);
    }

    //静态方法
    public static void display1() {
        //通过实例化对象的方法,访问非静态成员。
        car c = new car("红色",350000);
        System.out.println(car.firm + c.color + c.price);
    }

}