package packageEx;

public class HelloWord {
    public static void main(String[] args) {
        int score = 100;
        //包装类-自动装箱
        Integer t1  = score;
        //手动拆箱
        double t2 = t1.doubleValue();
        long t3 = t1.longValue();
        //自动拆箱
        int t4 = t1;

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);



    }
}
