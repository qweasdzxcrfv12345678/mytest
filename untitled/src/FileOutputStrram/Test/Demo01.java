package FileOutputStrram.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos1=new FileOutputStream("D:/a.txt");//创建文件
        File file = new File("D:/a.txt");

        FileOutputStream fos = new FileOutputStream(file,true);//加一个true  追加写
//        fos.write(96);
//        fos.write(97);
//        fos.write(98);
//        fos.write(99);
//        fos.write(100);
//        fos.write(1);
//        fos.write('1');
        byte[] bytes = "abcde\r\n".getBytes();
        fos.write(bytes);
        fos.write(bytes,1,2);

        //关流  释放资源
        fos.close();
    }
}
