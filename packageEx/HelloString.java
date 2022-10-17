package packageEx;

public class HelloString {
    public static void main(String[] args) {
        int t1 = 10;
        //基本数据类型转换为字符串
        String t2 = Integer.toString(t1);

        //字符串转换为基本数据类型
        int t3 = Integer.parseInt(t2);
        int t4 = Integer.valueOf(t2);

        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }
}
