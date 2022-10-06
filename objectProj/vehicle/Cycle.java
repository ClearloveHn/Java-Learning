package objectProj.vehicle;

public class Cycle extends Vehicle{
    public Cycle(String model,String color) {
        super(model,color);
    }

    @Override
    public void display() {
        System.out.println("自行车类信息测试:这是一辆" + this.getColor() + "颜色的," + this.getModel()
        + "牌自行车");
    }
}
