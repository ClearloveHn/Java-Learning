package objectProj.book;

public class bookTest {
    public static void main(String[] args) {
        book b = new book("红楼梦", 8, "曹雪芹", "人民文学出版社");
        b.describe();
        System.out.println("========================");
        book b1 = new book("小李飞刀", 15, "古龙", "中国长安出版社");
        b1.describe();
    }
}
