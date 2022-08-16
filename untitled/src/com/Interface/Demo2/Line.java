package com.Interface.Demo2;

public class Line {
    private String employMontClass;
    private int money;

    public Line(){

    }

    public Line(String employMontClass, int money) {
        this.employMontClass = employMontClass;
        this.money = money;
    }

    public String getEmployMontClass() {
        return employMontClass;
    }

    public void setEmployMontClass(String employMontClass) {
        this.employMontClass = employMontClass;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
