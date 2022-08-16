package com.Abstrct.Test;

public class Dog extends Animal{

    @Override
   public void behavior() {
        System.out.println("狗...");
    }
    public void eat(){
        System.out.println("狗啃骨头");
    }

    public Dog(String name, int age) {
        super(name, age);

    }
}
