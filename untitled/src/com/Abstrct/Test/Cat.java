package com.Abstrct.Test;

public class Cat extends Animal{

    @Override
   public void behavior() {
        System.out.println("猫...");
    }

    public Cat(String name, int age) {
        super(name, age);

    }
}
