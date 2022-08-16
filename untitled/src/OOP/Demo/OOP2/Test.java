package OOP.Demo.OOP2;

public class Test {
    public static void main(String[] args) {
        Programmer programmer=new Programmer("张三","001",3500);
        programmer.work();
        System.out.println(programmer);

        Manager manager=new Manager("李四","002",5000,1000);
        manager.work();
        System.out.println(manager);
    }
}
