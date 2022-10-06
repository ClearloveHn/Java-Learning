package objectProj.animal;

public class Cat extends Animal {
    private double weight; //

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void run() {
        System.out.println(this.getName() + this.getSpecies() + "在跑");
    }


}
