package com.Java;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(method(6));
    }
    public static int method(int n){
        if (n==1){
            return 1;
        }
        return n * method(n - 1);
    }
}
