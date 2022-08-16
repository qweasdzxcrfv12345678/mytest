package OOP.Demo.OOP2;

public class Programmer extends Employee{
    public Programmer(String name, String id, double money) {
        super(name, id, money);
    }

    public Programmer() {
    }

    @Override
    void work() {
        System.out.println("写代码");
    }

    @Override
    public String toString() {
        return "Programmer{} " + super.toString();
    }
}
