package FileOutputStrram.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo03 {
    public static void main(String[] args) throws Exception {
        //文件的复制
        FileInputStream fis=new FileInputStream("D:/a.txt");//读出原有的文件
        FileOutputStream fos = new FileOutputStream("D:/b.txt");//创建写入原有文件
        int len;
        byte[] bytes=new byte[1024];
        while ((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }
}
