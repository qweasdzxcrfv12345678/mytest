package JavaArrayTest;

import java.util.Scanner;

/*3.	从键盘上输入10个整数，合法值为1、2、3。不是这3个	数则为非法数字。编程统计每个整数和非法数字的个数。*/
public class ArrayDemo3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int[] arr=new int[10];
        for (int i=0;i <10;i++){
            System.out.println("输入一个整数:");
            arr[i]=scanner.nextInt();
            if (arr[i]==1){
                count1++;
            }else if (arr[i]==2){
                count2++;
            }else if (arr[i]==3){
                count3++;
            }else{
                count4++;
            }
        }
        System.out.println("合法值为1个数为:"+count1+" ，合法值为2个数为:"+count2+" ，合法值为3个数为:"+count3+" ,非法数字的个数"+count4);
    }
}
