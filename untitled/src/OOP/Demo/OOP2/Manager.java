package OOP.Demo.OOP2;

public class Manager extends Employee{
    private double bonus;

    public Manager() {
    }

    public Manager(String name, String id, double money, double bonus) {
        super(name, id, money);
        this.bonus = bonus;
    }

    @Override
    void work() {
        System.out.println("盯着程序员写代码");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                "} " + super.toString();
    }
}
