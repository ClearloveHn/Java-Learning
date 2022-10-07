package objectProj.Cars;

public class car {
    private String color;
    private String userName;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public car(){}
    public car(String color, String userName) {
        this.setColor(color);
        this.setUserName(userName);
    }

    public void use() {
        System.out.println("我是机动车");
    }

}
