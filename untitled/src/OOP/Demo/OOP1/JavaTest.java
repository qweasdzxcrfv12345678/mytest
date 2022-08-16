package OOP.Demo.OOP1;

public class JavaTest {
    public static void main(String[] args) {
        Animal[] arr=new Animal[5];

        for (int i=0;i< arr.length;i++){
            int number=(int)(Math.random()*3);
            if (number==0){
                arr[i]= new Cat();
            }else if (number==1){
                arr[i]=new Dog();
            }else {
                arr[i]= new Sheep();
            }
            arr[i].cry();
        }
    }
}
