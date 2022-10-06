package objectProj.vehicle;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("天宇","红",4,2);
        vehicle.display();

        Cycle cycle = new Cycle("捷安特","黄");
        cycle.display();

        ElectronicCycle electronicCycle = new ElectronicCycle();
        electronicCycle.setElectronicModel("飞鸽");
        electronicCycle.display();

        ThreeCycle threeCycle = new ThreeCycle();
        threeCycle.display();
    }
}
