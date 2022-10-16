package abstractExample;

public class Cricle extends Shape {
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    private double r;
    public Cricle(double r) {
        this.setR(r);
    }

    @Override
    public void area() {
        double area = Math.PI * (this.getR()*this.getR());
        System.out.println("圆的面积为:" + area);
    }


}
