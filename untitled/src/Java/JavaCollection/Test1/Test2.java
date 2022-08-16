package Java.JavaCollection.Test1;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add("你好");

        Student student=new Student("张三",20);
        list.add(student);
        System.out.println(list);

//        list.remove(student);
//        System.out.println(list);



//        Iterator<Object> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }



    }
}
