package Java.JavaCollection.Demo2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al.get(4) - al.get(0));
    }
}
