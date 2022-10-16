package practiceAnimal;

public class Animal {
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    private String kind;
    public Animal(){}
    public Animal(String kind) {
        this.setKind(kind);
    }

    public void cry() {
    }


}
