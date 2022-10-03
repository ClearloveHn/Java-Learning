package Java;

/**
 * 方法重载:方法名相同,参数列表不同(参数的个数和类型不同)
 */

public class practiceMethod {
    public static void main(String[] args) {
        double radius = 4.5;
        int length = 8;
        int wide = 5;
        practiceMethod practiceMethod = new practiceMethod();
        practiceMethod.calcArea(radius);
        practiceMethod.calcArea(length,wide);

    }

    public void calcArea(double radius) {
        double area = Math.PI* radius*radius;
        System.out.println("圆的面积为:" + area);
    }

    //方法重载
    public void calcArea(int length, int wide) {
        int area = length*wide;
        System.out.println("长方形的面积为:" + area);
    }
}


