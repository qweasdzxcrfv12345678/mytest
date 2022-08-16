package OOP.Test.ExtendstTest;

public class Cat extends Animal{
    public Cat() { }

    @Override
     void behavior() {
        System.out.println(this.name+"抓老鼠");
    }

    public Cat(String name, int age){
        super(name,age);


    }
}
