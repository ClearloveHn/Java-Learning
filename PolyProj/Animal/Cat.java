package PolyProj.Animal;

public class Cat extends Animal{
    private double weight;

    public Cat() {}

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Cat(String name,int month,double weight) {
        super(name,month);
        this.setWeight(weight);
    }

    public void run() {
        System.out.println("小猫快乐的奔跑");
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
