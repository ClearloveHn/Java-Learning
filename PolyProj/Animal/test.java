package PolyProj.Animal;

/**
 *向上转型 (Java中多态的实现)
 * 1.父类引用指向子类的实例
 * 2.可以调用子类重写父类的方法以及父类派生的方法,无法调用子类特有的方法。
 */

public class test {
    public static void main(String[] args) {
        Animal one = new Animal();
        one.eat();
        System.out.println("=============");
        Animal two = new Cat();
        two.eat();
        System.out.println("==============");
        Animal three = new Dog();
        three.eat();

        /**
         * 向下转型-强转
         * 1.子类引用指向父类对象,此处必须强转,可以调用子类特有的方法
         * 2.必须满足转型条件
         */
        Cat cat = (Cat) one;
        cat.eat();
        cat.run();
    }
}
