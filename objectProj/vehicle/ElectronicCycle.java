package objectProj.vehicle;

public class ElectronicCycle extends Vehicle{
    private String electronicModel;


    public String getElectronicModel() {
        return electronicModel;
    }

    public void setElectronicModel(String electronicModel) {
        this.electronicModel = electronicModel;
    }

    public void display() {
        System.out.println("这是一辆使用" + this.getElectronicModel() + "牌电池的电动车");
    }
}
