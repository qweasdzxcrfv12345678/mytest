package com.Java;

import java.util.Scanner;

public class JavaDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入一个字符串");
            String str = sc.next();
            int i = str.charAt(0)-'0';
            if ((i<=9 && i>=0) && str.length()>=7){
                System.out.println(str.substring(0,3));
                break;
            }else {
                System.out.println("输入的数据不合法请重新输入");
            }
        }
    }
}
