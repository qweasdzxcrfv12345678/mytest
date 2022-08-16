package com.Interface.Demo2;

public class Student implements Study{
    private String name;
    private double score;
    private Line line;

    public Student() {
    }

    public Student(String name, double score, Line line) {
        this.name = name;
        this.score = score;
        this.line = line;
    }

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void exam(){
        if (this.score >= 60){
            System.out.println("你的成绩为"+this.score+",考试通过");
        }else {
            System.out.println("你的成绩为"+this.score+",考试不通过");
        }
    }


    @Override
    public void studyLine() {
        System.out.println("您报名的就业班为："+this.line.getEmployMontClass()+",应缴纳学费："+this.line.getMoney());
    }
}
