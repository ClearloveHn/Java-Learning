package PolyProj.Animal;

public class Master {

    //方案一
    public void feed(Cat cat) {
        cat.eat();
        cat.playBall();
    }

    public void feed(Dog dog) {
        dog.eat();
        dog.sleep();
    }

    //方案二
    //利用类型转换-多态
    //编写方法传入动物的父类,方法中通过类型转换,调用指定子类的方法
    public  void feed(Animal obj) {
        if (obj instanceof Cat) {
            Cat temp = (Cat)obj;
            temp.eat();
            temp.playBall();
        }else if (obj instanceof Dog) {
            Dog temp = (Dog)obj;
            temp.eat();
            temp.sleep();
        }
    }
}
