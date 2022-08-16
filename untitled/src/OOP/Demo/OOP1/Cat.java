package OOP.Demo.OOP1;

public class Cat extends Animal{
    public Cat(String kind) {
        super(kind);
    }

    public Cat() {

    }

    @Override
    public void cry() {
        System.out.println("小猫的叫声：喵喵喵~~~");
    }
}
