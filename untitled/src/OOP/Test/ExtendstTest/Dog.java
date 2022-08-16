package OOP.Test.ExtendstTest;

public class Dog extends Animal{
    public Dog() { }

    @Override
     void behavior() {
        System.out.println(this.name+"在看家");
    }

    public Dog(String name, int age){
        super(name, age);

    }
}
