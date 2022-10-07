package objectProj.Cars;

public class test {
    public static void main(String[] args) {
       car car =  new car();
       car.use();
        System.out.println("=================");
        taxi taxi = new taxi("蓝色","张小泉","长生公司");
        taxi.use();
        taxi.ride();
        homeCar homeCar = new homeCar("紫色","孙二娘",7);
        homeCar.display();
        homeCar.display(5);
    }
}
