package Java.JavaHashMap.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Monst monst1=new Monst("小小怪",10000);
        Monst monst2=new Monst("大大怪",12000);
        Monst monst3=new Monst("boss",50000);
        Hero hero=new Hero("英雄",50001);

        HashMap<String,Monst> map=new HashMap<>();
        map.put(monst1.getName(),monst1);
        map.put(monst2.getName(),monst2);
        map.put(monst3.getName(),monst3);

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入怪兽的名字：");
        String name=scanner.next();

        Monst monst = map.get(name);
        while (hero.getBlood()>0&&monst.getBlood()>0){
            monst.Attack(hero);
            hero.Attack(monst);
            monst.SayHy();
            hero.SayHy();
        }



    }
}
