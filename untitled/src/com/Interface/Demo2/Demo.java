package com.Interface.Demo2;

public class Demo {
    public static void main(String[] args) {
        Line line=new Line("成就班",19980 );
        Student student=new Student();
        student.setName("张三");
        student.setScore(88);
        student.setLine(line);
        student.exam();
        student.studyLine();

    }
}
