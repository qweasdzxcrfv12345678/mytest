package Java.JavaCollection.Demo7;

import com.Interface.Demo.Student;

import java.util.ArrayList;

/*4、编写班级类(班级类:BanJi)，
一个班级可以存放多个学生(学生类:Student)。
数组？  大小不可变 方法不多
集合？  大小可变   有很多方法
1.增加一个学员的方法Add(Student student)
2.方法 remove()方法，
删除一个学员。
删除有二种方式，
第一种，可以传入下标，
第二种，可以传入对象。
3.一个班级与另一个班级联宜，
addAll()将两个班级的学员合并成一个班级*/
public class BanJi {
   ArrayList<Student> list;

    @Override
    public String toString() {
        return "BanJi{" +
                "list=" + list +
                '}';
    }

    public BanJi(){

    }
    public BanJi(ArrayList<Student> list){
        this.list = list;
    }
    void add(Student student){

    }
    void remove(int index){

    }
}
