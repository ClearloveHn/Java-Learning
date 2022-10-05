package objectProj.book;

public class book {
    private String name;
    private double price;
    private String author;
    private String chuBanShe;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price < 10) {
            price = 10;
        }
        this.price = price;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getChuBanShe() {
        return chuBanShe;
    }
    public void setChuBanShe(String chuBanShe) {
        this.chuBanShe = chuBanShe;
    }

    public book(String name,double price,String author,String chuBanShe) {
        this.setName(name);
        this.setPrice(price);
        this.setAuthor(author);
        this.setChuBanShe(chuBanShe);
    }

    public void describe() {
        System.out.println("书名:" + this.getName());
        System.out.println("作者:" + this.getAuthor());
        System.out.println("出版社:" + this.getChuBanShe());
        System.out.println("价格:" + this.price);

    }




}
