package FileOutputStrram.Test1;

import java.io.FileReader;

//读，打印
public class Demo04 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("D:/a.txt");
//        int read = fr.read();
//        System.out.println(read);
//        System.out.println((char)read);
//        fr.close();

        int len;
        char[] chars= new char[1024];
        while ((len = fr.read(chars))!= -1){

            System.out.println(new String(chars,0,len));
        }
        fr.close();
    }
}
