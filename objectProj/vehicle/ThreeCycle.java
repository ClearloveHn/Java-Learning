package objectProj.vehicle;

public class ThreeCycle extends Vehicle{
    public ThreeCycle() {
        this.setWheel(3);
    }

    public void display() {
        System.out.println("三轮车是一款有" + this.getWheel() + "个轮子的非机动车");
    }
}
