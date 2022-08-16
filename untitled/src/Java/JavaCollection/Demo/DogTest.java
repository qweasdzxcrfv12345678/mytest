package Java.JavaCollection.Demo;

import java.util.ArrayList;

public class DogTest {
    public static void main(String[] args) {
        ArrayList<Dog> list=new ArrayList<>();
        list.add(new Dog("小白",4));
        list.add(new Dog("小黑",1));
        list.add(new Dog("小灰",5));
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        boolean boo=list.contains(new Dog("小黑",1));
        System.out.println(boo);



    }
}
