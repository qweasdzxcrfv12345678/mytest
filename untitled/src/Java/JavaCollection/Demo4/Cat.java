package Java.JavaCollection.Demo4;

public class Cat {
    private String name;
    private double i;

    public Cat() {
    }

    public Cat(String name, double i) {
        this.name = name;
        this.i = i;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", i=" + i +
                '}';
    }
}
