package objectProj.animal.student;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.student();
        person.sex("女");
        person.name = "李明";
        person.age = 10;
        person.grade = 5;
        person.mySelf();
    }
}
