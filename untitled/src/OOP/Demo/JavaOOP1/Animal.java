package OOP.Demo.JavaOOP1;

public class Animal {
    public static void main(String[] args) {

        cat ct=new cat();
        ct.setName("阿猫");
        ct.setColor("黑色");
        System.out.println(ct.getName());
        System.out.println(ct.getColor());

        cat ac=new cat("汤姆","蓝色");
        ac.eat();
        ac.sleep();
        System.out.println(ac);
    }
}
