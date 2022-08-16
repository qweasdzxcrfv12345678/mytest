package OOP.Demo.OOP1;

public class Dog extends Animal{
    public Dog(String kind) {
        super(kind);
    }

    public Dog() {

    }

    @Override
    public void cry() {
        System.out.println("小狗的叫声：汪汪汪~~~");
    }
}
