package Java.JavaCollection.Demo1;

import java.util.ArrayList;

public class CatTest {
    public static void main(String[] args) {
        ArrayList<Cat> list = new ArrayList<>();
        list.add(new Cat("abc"));
        list.add(new Cat("deg"));
        list.add(new Cat("fij"));
        System.out.println(list.size()); //创建对象的个数
//        for (Cat obj:list){
//            Cat cat=(Cat) obj; //强转
//            obj.show();
//        }
        for (Cat cat:list){
            cat.show();
        }
        System.out.println(list);
    }
}
