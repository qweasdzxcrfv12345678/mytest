package Java.JavaCollection.Demo4;

import java.util.ArrayList;

/*1、使用ArrayList类生成一个集合对象，向此集合对象中加入“一只狗对象”，“一只猫对象”，
一个整数包装对象1，一个小数包装对象5.8，再加入一个“人对象”。
然后循环输出这些对象的值。(不要用泛型)*/
public class Test {
    public static void main(String[] args) {
        ArrayList<Object> list=new ArrayList<>();
        list.add(new Dog("一只狗对象",1));
        list.add(new Cat("一只猫对象",5.8));
        list.add(new Person("人对象"));

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
