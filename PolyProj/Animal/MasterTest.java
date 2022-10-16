package PolyProj.Animal;

public class MasterTest {

    public static void main(String[] args) {
        Master master = new Master();
        Cat one = new Cat();
        Dog two = new Dog();
        master.feed(one);
        master.feed(two);

        master.feed(one);
        master.feed(two);
    }


}
