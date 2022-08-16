package com.Interface.Demo;

public class Student extends Person implements Learning{
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void sleep() {
        System.out.println("年龄为"+this.getAge()+"的"+this.getName()+"学生正在教室午睡");
    }

    public void playGame(){
        System.out.println("年龄为"+this.getAge()+"的"+this.getName()+"学生在教室玩游戏被老师抓住了");
    }

    public void study(Student stu){
        System.out.println("学习第一，再无手机");
    }
}
