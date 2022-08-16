package Java.JavaCollection.Demo5;

public class Student {
    private int id;
    private String name;
    private char sex;
    private double score;

    public Student() {
    }

    public Student(int id, String name, char sex, double score) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if (sex=='男'||sex=='女'){
            this.sex = sex;
        }else {
            System.out.println("性别只能是‘男’或‘女’");
        }
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "学生{" +
                "编号：" + id +
                ", 姓名：'" + name + '\'' +
                ", 性别：" + sex +
                ", 成绩：" + score +
                '}';
    }
}
