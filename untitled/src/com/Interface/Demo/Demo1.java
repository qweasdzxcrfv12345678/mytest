package com.Interface.Demo;

public class Demo1 {
    public static void main(String[] args) {
        Person person=new Person("邓某人",20);
        person.sleep();
        Student student=new Student("肖某人",20);
        student.sleep();
        student.playGame();
        student.study(student);



    }
}
