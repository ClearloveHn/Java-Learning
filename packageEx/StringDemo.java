package packageEx;

public class StringDemo {
    public static void main(String[] args) {
        String str = "abcdefg";
        //字符a在字符串当中第一次出现的位置
        System.out.println(str.indexOf('a'));

        //子串"cd"在字符串中第一次出现的位置
        System.out.println(str.indexOf("cd"));

        //字符’g‘在字符串中最后一次出现的位置
        System.out.println(str.lastIndexOf('g'));

        //取出字符串"cde"并转为大写
        String str1 = str.substring(2,5);
        //字符串转为大写
        String str2 = str1.toUpperCase();
        System.out.println(str2);
        //字符串替换
        System.out.println(str2.replaceAll("DE","MM"));



    }
}
