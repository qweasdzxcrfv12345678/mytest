package Java.JavaCollection.Demo1;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public void show(){
        System.out.println(name);
    }

}
