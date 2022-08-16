package OOP.Demo.JavaOOP5;

public class Monkey {
    private String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    Monkey(String s) {
        this.s = s;
    }

    public void speak(){
        System.out.println("咿咿呀呀......");
    }
}
