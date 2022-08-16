package Java.JavaCollection.Test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Object> list=new ArrayList<>();
        boolean add=list.add(1);
        list.add("你好");
        System.out.println(list);

        //删除
        list.remove(0);//下标,对象
        System.out.println(list);

        //修改
        list.set(0,"集合");
        System.out.println(list);

        ArrayList<Object> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list.addAll(list1);
        System.out.println(list1);
    }
}
