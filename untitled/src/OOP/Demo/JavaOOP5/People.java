package OOP.Demo.JavaOOP5;

public class People extends Monkey{
    People(String s) {
        super(s);
    }

    @Override
    public void speak() {
        System.out.println("小样的，不错嘛！会说话了!");
    }

    void think(){
        System.out.println("别说话！认真思考!");
    }

}
