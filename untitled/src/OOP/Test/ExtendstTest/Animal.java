package OOP.Test.ExtendstTest;

public class Animal {
    protected String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() { }
    public void eat(){
        System.out.println(name+"在吃饭");
    }
     void behavior(){ }
    public void introduction(){
        System.out.println("姓名： "+name+",年龄： "+age);
    }
}
