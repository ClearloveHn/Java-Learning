package work;

public class TestWork extends Work{
    private int TestCase;

    public TestWork(int testCase) {
        this.setTestCase(testCase);
    }
    public int getTestCase() {
        return TestCase;
    }

    public void setTestCase(int testCase) {
        TestCase = testCase;
    }

    @Override
    public void display() {
        System.out.println(this.getName() + ":测试工作的日报是: 今天编写了" + this.TestCase + "个测试用例"
        + "发现了" + this.getBug() + "个Bug");
    }
}
