package JavaArrayTest;

import java.util.Scanner;

/* 1.依次输入5句话，然后将它逆序输出。*/
public class ArrayDemo1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] arr=new String[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("输入第"+(i+1)+"句话:");
            arr[i]=scanner.next();
        }
        System.out.println("逆序输出为：");
        for (int i = arr.length - 1;i >= 0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
