package Java.JavaCollection.Demo4;

public class Dog {
    private String name;
    private int i;

    public Dog(){

    }
    public Dog(String name, int i) {
        this.name = name;
        this.i = i;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", i=" + i +
                '}';
    }
}
