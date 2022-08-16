package Java.JavaHashCode.Demo;

import java.util.Scanner;

public class JavaDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入year：");
        int year = scanner.nextInt();
        System.out.println("请输入month：");
        int month = scanner.nextInt();

        //计算距离1900年有多少天
        int sum = 0;
        for (int i = 1900; i < year; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                sum += 366;
            } else {
                sum += 365;
            }
        }
        //计算月份的天数
        int num = 0;
        for (int i = 1; i < month; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                num += 31;
            } else if (i == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    num += 29;
                } else {
                    num += 28;
                }
            } else {
                num += 30;
            }
        }

        //总天数
        int result = num + sum;
        //当月的1号是星期几
        int index = (result + 1) % 7;
        //System.out.println(result+" "+index);
        System.out.println("日\t一\t二\t三\t四\t五\t六\n");

        //当月多少天
        int days = 0;
        for (int i = 1; i <= month; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                days=31;
            }else if (i==2){
                if ((year%4==0&&year%100!=0) || year%400==0){
                    days =29;
                }else {
                    days =28;
                }
            }else {
                days =30;
            }
        }
        //System.out.println(days);

        //打印空格
        for (int i= 0;i < index;i++){
            System.out.print("\t");
        }
        //遍历,打印日历,控制格式
        for (int i=1;i <=days;i++){
            System.out.print(i);
            index++;
            if (index%7==0){
                System.out.println("\n");
            }else {
                System.out.print("\t");
            }
        }
    }
}
