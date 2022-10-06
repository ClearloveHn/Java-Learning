package objectProj.work;

public class Test {
    public static void main(String[] args) {
        Work work = new Work("父类信息测试");
        work.display();

        TestWork testWork = new TestWork(10);
        testWork.setName("测试工作类信息测试");
        testWork.setBug(5);
        testWork.display();

        developmentWork developmentWork = new developmentWork("研发工作类信息测试",1000,10);
        developmentWork.display();
    }
}
