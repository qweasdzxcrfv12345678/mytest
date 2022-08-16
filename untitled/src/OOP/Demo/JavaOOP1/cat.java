package OOP.Demo.JavaOOP1;

public class cat {
    private String name;
    private String color;

    public cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void sleep(){
        System.out.println(name+"在睡觉");
    }
    public void eat(){
        System.out.println(name+"在吃鱼");
    }
}
