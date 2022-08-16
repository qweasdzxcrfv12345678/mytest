package Java.JavaHashMap.Test;

import java.util.Random;

public class Monst {
    private String name;
    private int blood;

    public Monst() {
    }

    public Monst(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

     void SayHy(){
        System.out.println("我是怪物"+this.name+",有"+this.blood+"滴血");
    }
    void Attack(Hero hero){
        System.out.println(hero.getName()+"英雄，吃了我一刀，再将该英雄的生命值减一");
        Random random=new Random();
        int i=random.nextInt(100)+1;
        if (i<=45){
            System.out.println("暴击");
            hero.setBlood(hero.getBlood() - 100);
        }else {
            hero.setBlood(hero.getBlood() - 1);
        }
    }

    @Override
    public String toString() {
        return "Monst{" +
                "name='" + name + '\'' +
                ", blood=" + blood +
                '}';
    }

}
