package interfaceExample1;

public class Bird  implements IFly{
    @Override
    public void fly() {
        System.out.println("小鸟在天上翱翔");
    }
}
