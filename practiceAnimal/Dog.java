package practiceAnimal;

import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.bouncycastle.pqc.crypto.newhope.NHSecretKeyProcessor;

public class Dog extends Animal{
    public Dog(){}

    @Override
    public void cry() {
        System.out.println("小狗的叫声：汪汪汪");
    }
}
