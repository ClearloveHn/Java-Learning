package objectProj.monkey;

public class monkeyTest {
    public static void main(String[] args) {
        monkey m = new monkey();
        m.name = "长尾猴";
        m.feature = "尾巴长";
        System.out.println("名称:" + m.name);
        System.out.println("特征:" + m.feature);

        monkey m1 = new monkey("白头叶猴","喜欢吃树叶");
        System.out.println("名称:" + m1.name);
        System.out.println("特征:" + m1.feature);
    }
}
