package Java.JavaHashCode.Test;

import java.util.ArrayList;
import java.util.Collections;

public class JavaTest {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        String[] arr1={"♠","♥","♣","♦"};
        String[] arr2={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        list.add("大王");
        list.add("小王");
        for (int i = 0;i < arr1.length;i++){
            for (int j = 0; j < arr2.length; j++) {
                list.add(arr1[i]+arr2[j]);
            }
        }
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
        //发牌
        ArrayList<String> dipai=new ArrayList<>();
        ArrayList<String> liudehua=new ArrayList<>();
        ArrayList<String> zhouxingchi=new ArrayList<>();
        ArrayList<String> zhourunfa=new ArrayList<>();

        for (int i = 0; i < list.size() ; i++) {
            if (i >= list.size()-3){
                dipai.add(list.get(i));
            }else {
                if (i %3==0){
                    liudehua.add(list.get(i));
                }else if (i % 3 ==1){
                    zhouxingchi.add(list.get(i));
                }else {
                    zhourunfa.add(list.get(i));
                }
            }
        }

        Collections.sort(liudehua);
        Collections.sort(zhouxingchi);
        Collections.sort(zhourunfa);

        System.out.println(liudehua);
        System.out.println(zhouxingchi);
        System.out.println(zhourunfa);
        System.out.println(dipai);
    }
}
