package comThrowable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) /*throws ParseException 抛出异常*/ {
        SimpleDateFormat sdf=new SimpleDateFormat("yyy-MMM-dd");
        try {
            Date date=sdf.parse("2022-03-21");
        } catch (ParseException e) {
            e.printStackTrace();//异常打印信息
            return;// 不会执行System.out.println("异常打印信息通过才执行");
        }finally {
            System.out.println("finally{这里的代码必须执行}");
        }
        System.out.println("异常打印信息通过才执行");
    }
}
