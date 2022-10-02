package Java;

public class practiceArray2 {
    public static void main(String[] args) {
        char[] ch = {'a','b','c','d','A','A','a'};
        int count = 0;
        for (int i = 0;i<ch.length;i++){
            if (ch[i] == 'a'||ch[i] == 'A'){
                count++;
            }
        }
        System.out.println(count);
    }
}
