package objectProj.Cars;

public class taxi extends car{
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public taxi(String color,String userName,String company) {
        super(color,userName);
        this.setCompany(company);
    }

    @Override
    public void use() {
        System.out.println("出租车是提高市民生活质量的重要条件之一");
    }

    //此函数不能被重写
    public final void ride() {
        System.out.println(this.getUserName() + "的出租车是属于" + this.getCompany() + "的");
    }
}
