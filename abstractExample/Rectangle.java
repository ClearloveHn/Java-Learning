package abstractExample;

public class Rectangle  extends Shape{
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    private double length;

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    private double wide;

    public Rectangle(double length,double wide){
        this.setLength(length);
        this.setWide(wide);
    }

    @Override
    public void area() {
        double area = this.getLength() * this.getWide();
        System.out.println("矩形的面积为:" + area);
    }
}
