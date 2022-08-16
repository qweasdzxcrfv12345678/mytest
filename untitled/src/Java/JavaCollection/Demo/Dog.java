package Java.JavaCollection.Demo;

import java.util.Objects;

public class Dog {
    private String name;
    private int ade;

    public Dog() {
    }

    public Dog(String name, int ade) {
        this.name = name;
        this.ade = ade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return ade == dog.ade &&
                Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ade);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", ade=" + ade +
                '}';
    }
}
