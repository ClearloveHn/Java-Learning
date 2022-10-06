package objectProj.Car;

public class carTest {
    public static void main(String[] args) {
        //类外成员访问方式:类名+静态变量名
        car.firm = "BMY";

        car one = new car("白色",300000);
        one.display();
        car two = new car("黑色",500000);
        two.display();

        car.display1();

        //对象名.静态成员名
        two.firm = "Benz"; //改变了(two对象)静态变量firm的值
        one.display();  //所有对象都发生了改变

        one.display1();
    }
}
