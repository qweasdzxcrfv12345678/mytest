package FileOutputStrram.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:/a.txt");//找文件
        int len;
        byte[] bytes = new byte[2];//一般是1024的倍数
        while ((len = fis.read(bytes))!= -1){
            System.out.println(len);
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
    }
}
