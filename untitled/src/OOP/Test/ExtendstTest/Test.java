package OOP.Test.ExtendstTest;

public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog("狗",5);
        dog.introduction();
        dog.eat();
        dog.behavior();

        Cat cat=new Cat("猫",3);
        cat.introduction();
        cat.eat();
        cat.behavior();
    }
}
