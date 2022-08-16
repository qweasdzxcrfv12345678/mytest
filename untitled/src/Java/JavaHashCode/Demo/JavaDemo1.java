package Java.JavaHashCode.Demo;

import java.util.ArrayList;
import java.util.Collections;

public class JavaDemo1 {
    public static void main(String[] args) {
        //准备牌
        ArrayList<String> list = new ArrayList<>();
        String[] arr = {"♠","♥","♣","♦"};
        String[] arr2 = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        list.add("大王");
        list.add("小王");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                list.add(arr[i]+arr2[j]);
            }
        }
        System.out.println(list);
        //洗牌,打乱顺序
        Collections.shuffle(list);
        System.out.println(list);
        //发牌
        ArrayList<String> dipai = new ArrayList<>();
        ArrayList<String> liudehua = new ArrayList<>();
        ArrayList<String> zhouxingchi = new ArrayList<>();
        ArrayList<String> zhourunfa = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i>=list.size()-3){
                dipai.add(list.get(i));
            }else {
                if (i%3==0){
                    liudehua.add(list.get(i));
                }else if (i%3==1){
                    zhouxingchi.add(list.get(i));
                }else {
                    zhourunfa.add(list.get(i));
                }
            }
        }
        //看牌
        Collections.sort(liudehua);
        Collections.sort(zhourunfa);
        Collections.sort(zhouxingchi);
        System.out.println("刘德华："+liudehua);
        System.out.println("周星驰："+zhouxingchi);
        System.out.println("周润发："+zhourunfa);
        System.out.println("底牌："+dipai);
    }
}
