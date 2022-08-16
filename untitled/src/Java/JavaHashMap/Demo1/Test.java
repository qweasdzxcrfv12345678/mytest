package Java.JavaHashMap.Demo1;

import java.util.Collection;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer,Book> hashMap=new HashMap<>();
        hashMap.put(1,new Book("数学",20,"数学老师"));
        hashMap.put(2,new Book("Java",20,"Java老师"));
        hashMap.put(3,new Book("HTML",20,"HTML老师"));

        Collection<Book> values=hashMap.values();
        for (Book value:values){
            System.out.println(value);
        }
    }
}
