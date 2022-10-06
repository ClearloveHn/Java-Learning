package objectProj.work;

public class developmentWork extends Work{
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public developmentWork(String name,int code,int bug) {
        this.setCode(code);
        this.setName(name);
        this.setBug(bug);
    }

    @Override
    public void display() {
        System.out.println(this.getName() + ":研发工作的日报是:今天编写了" + this.code + "行代码"
        + ",目前仍有" + this.getBug() + "个Bug没解决。");
    }
}
