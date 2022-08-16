package Java.JavaCollection.Demo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Object> list=new ArrayList<>();
        int num;
        for (int i = 0; i <10 ; i++) {
             num = (int)(Math.random()*2);
            if (num==0){
                list.add(new Cat(""+(i+1)));
            }else {
                list.add(new Pig(""+(i+1)));
            }
        }
        System.out.print(list);
    }
}
