package com.Abstrct.Test;

public class Test1 {
    public static void main(String[] args) {
        Dog dog=new Dog("狗",5);

        dog.eat();
        dog.sleep();
        dog.behavior();

        Cat cat=new Cat("猫",4);
        cat.eat();
        cat.sleep();
        dog.behavior();
    }
}
