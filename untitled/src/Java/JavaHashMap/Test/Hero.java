package Java.JavaHashMap.Test;

import java.util.Random;

public class Hero {
    private String name;
    private int blood;

    public Hero() {
    }

    public Hero(String name, int blood) {
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
        System.out.println("我是英雄"+this.name+",有"+this.blood+"滴血");
    }
    void Attack(Monst monst){
        System.out.println(monst.getName()+"怪物，被我砍了一刀，再将该怪物的生命值减一");
        Random random=new Random();
        int i=random.nextInt(100)+1;
        if (i<=45){
            System.out.println("暴击");
            monst.setBlood(monst.getBlood() - 100);
        }else {
            monst.setBlood(monst.getBlood() - 1);
        }
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", blood=" + blood +
                '}';
    }
}
