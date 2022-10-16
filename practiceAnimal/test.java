package practiceAnimal;

import java.lang.reflect.Array;

/**
 * 用到了多态里面的向上转型
 * 父类的引用指向子类的对象 (把子类对象直接赋值给父类引用)
 */
public class test {
    public static void main(String[] args) {
        Animal animal[] = new Animal[5];

        for (int i = 0;i<animal.length;i++ ) {
            int n = (int) (Math.random() * 3);
            switch (n) {
                case 0:
                    animal[i] = new Cat();
                    break;
                case 1:
                    animal[i] = new Dog();
                    break;
                case 2:
                    animal[i] = new Sheep();
                    break;
            }
        }

        for (int i = 0;i<animal.length;i++) {
            animal[i].cry();
        }

    }

}
