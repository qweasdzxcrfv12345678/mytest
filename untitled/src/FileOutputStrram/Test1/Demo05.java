package FileOutputStrram.Test1;

import java.io.FileWriter;

//创建，写
public class Demo05 {
    public static void main(String[] args) throws Exception {
        FileWriter fw= new FileWriter("D:/c.txt",true);
        fw.write("一二三");
        fw.flush();

        fw.write("中国".toCharArray());
//        fw.flush();//把数据刷新到硬盘上去，流没有关闭
        fw.close();
    }
}
