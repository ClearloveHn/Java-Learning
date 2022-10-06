package objectProj.animal;

public class test {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.setName("blue");
        c.setSpecies("蓝猫");
        c.eat();
        c.run();
        System.out.println("==================");
        Dog d = new Dog();
        d.setName("茅台");
        d.setSex("公");
        d.eat();
        d.sleep();
    }
}
