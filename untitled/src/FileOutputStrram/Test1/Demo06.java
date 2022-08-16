package FileOutputStrram.Test1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo06 {
    public static void main(String[] args) {
        FileReader fr= null;
        FileWriter fw= null;
        try {
            fr = new FileReader("D:/c.txt");
            fw= new FileWriter("D:/d.txt",true);
            int len;//读出来的有效个数
            char[] chars=new char[1024];//字符数组
            while ((len = fr.read(chars))!= -1){
                fw.write(chars,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (fw!=null){
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (fr!=null){
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
