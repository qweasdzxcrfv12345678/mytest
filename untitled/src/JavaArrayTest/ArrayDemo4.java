package JavaArrayTest;

import java.util.Scanner;

/*4.  输入10个学生的单科成绩，求成绩在60分以下(不含)、	60~80分(含60不含80)和80分以上
		的学生各有多少个？并求出最高分、最低分和平均分*/
public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Scanner scanner=new Scanner(System.in);
        int count1=0;
        int count2=0;
        int count3=0;

        int max=0;
        int min=0;
        int sum=0;

        for (int i=0;i <arr.length;i++){
            System.out.println("输入第"+(i+1)+"名学生的成绩:");
            arr[i]=scanner.nextInt();

            if (arr[i] < 60){
                count1++;
            }else if (arr[i] <80){
                count2++;
            }else {
                count3++;
            }

            sum +=arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
            if (arr[min] > arr[i]){
                min = i;
            }
        }
        System.out.println("成绩在60分以下(不含)学生各有"+count1+"个");
        System.out.println("成绩在60~80分(含60不含80)学生各有"+count2+"个");
        System.out.println("成绩在80分以上学生各有"+count3+"个");
        System.out.println("最高分为:"+arr[max]);
        System.out.println("最低分为:"+arr[min]);
        System.out.println("平均分为:"+sum/arr.length);

    }
}
