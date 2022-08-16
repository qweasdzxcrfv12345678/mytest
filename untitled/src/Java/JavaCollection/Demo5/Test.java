package Java.JavaCollection.Demo5;

import java.util.ArrayList;
import java.util.Scanner;

/*2、写一个学生的类，类中有属性：编号（int），姓名(String)，
性别(char只能是‘男’或‘女’)，考试成绩(double)。
类中有所有属性的getXXX与setXXX方法。
默认的构造方法(不带参)，及能初始化所有属性的构造方法(带四个参数)。
再写一个测试类，main中生成一个ArrayList类的对象，用此对象放入多个学生对象。
要求：使用循环输入学生的编号，输入学生的姓名，输入学生的性别，
输入学生的成绩，然后生成一个学生对象，放入到集合对象中去。
然后问是否还要继续输入学生信息，如果回答是‘y’这个字符，
那么就再输入一个学生的信息，否则结束循环。最后输出所有学生的信息。*/
public class Test {
    public static void main(String[] args) {
        ArrayList<Object> list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        Student student=new Student();
        while (true){
            System.out.println("请输入编号：");
            int id = scanner.nextInt();
            System.out.println("请输入姓名：");
            String name = scanner.next();
            System.out.println("请输入性别：");
            String sex = scanner.next();
            char sex1=sex.charAt(0);
            System.out.println("请输入成绩：");
            double score = scanner.nextInt();
            student.setId(id);
            student.setName(name);
            student.setSex(sex1);
            student.setScore(score);
            list.add(student);
            System.out.println("是否还要继续输入学生信息  Y/N");
            String str=scanner.next();
            if (str.equals("y")){
                System.out.println("请输入编号：");
                int id1 = scanner.nextInt();
                System.out.println("请输入姓名：");
                String name1 = scanner.next();
                System.out.println("请输入性别：");
                String sex2 = scanner.next();
                char sex3=sex2.charAt(0);
                System.out.println("请输入成绩：");
                double score1 = scanner.nextInt();
                student.setId(id1);
                student.setName(name1);
                student.setSex(sex3);
                student.setScore(score1);
                list.add(student);
            }else {
                System.out.println(list);
                break;
            }
        }

    }
}
