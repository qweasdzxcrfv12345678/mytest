package com.Java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入日期(格式为yyyy年MM月dd日)：");
        String str=scanner.next();

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日");
        Date date=simpleDateFormat.parse(str);
        int day = date.getDay();

        System.out.println(day);

        long time = date.getTime();
        String year=str.substring(0,4);
        Date date1 = simpleDateFormat.parse(year+"年1月1日");
        long time1 = date1.getTime();
        long days=(time - time1)/1000/60/60/24+1;

        System.out.println(days);


    }
}
