package objectProj.vehicle;

public class Vehicle {
    private String model;
    private String color;
    private int wheel;
    private int seat;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public Vehicle() {
    }

    public Vehicle(String model, String color) {
        this.setModel(model);
        this.setColor(color);
    }

    public Vehicle(String model, String color, int wheel, int seat) {
        this.setModel(model);
        this.setColor(color);
        this.setWheel(wheel);
        this.setSeat(seat);
    }

    public void display() {
        System.out.println("父类信息测试:这是一辆" + this.getColor() + "颜色的," + this.getModel()
                + "牌的非机动车,有" + this.getWheel() + "个轮子,有" + this.getSeat() + "个座椅");
    }


}
