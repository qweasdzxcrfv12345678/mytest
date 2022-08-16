package com.Java;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        File file=new File("D:/kugou");
        method(file);
    }
    public static void method(File file){
        File[] file1=file.listFiles();
        for (int i=0;i< file1.length;i++){
            if (file1[i].isFile()){
                System.out.println(file1[i].getAbsoluteFile());
            }else {
                method(file1[i]);
            }
        }
    }
}
