package objectProj.Cars;

public final  class homeCar extends car{
private int nums;

public homeCar(String color,String userName,int nums) {
    super(color,userName);
    this.setNums(nums);
}


    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    public void display() {
        System.out.println(this.getUserName() + "拥有的" + this.getColor()
        + "颜色的私家车有" + this.getNums() + "座位");
    }

    public void display(int nums) {
        System.out.println("家用汽车大多有" + nums + "个座位");
    }
}
