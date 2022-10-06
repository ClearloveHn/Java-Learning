package work;

/**
 * 方法重写:
 * 1.有继承关系的子类。
 * 2.方法名相同,参数列表相同
 */
public class Work {
 private String name;
 private int bug;

 public Work(){

 }
 public Work(String name) {
     this.setName(name);
 }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(this.name + ":开心工作");
    }

    public int getBug() {
        return bug;
    }

    public void setBug(int bug) {
        this.bug = bug;
    }
}
