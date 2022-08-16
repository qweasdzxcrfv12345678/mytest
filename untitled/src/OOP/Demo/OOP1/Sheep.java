package OOP.Demo.OOP1;

public class Sheep extends Animal{
    public Sheep(String kind) {
        super(kind);
    }

    public Sheep() {

    }

    @Override
    public void cry() {
        System.out.println("小羊的叫声：咩咩咩~~~");
    }
}
