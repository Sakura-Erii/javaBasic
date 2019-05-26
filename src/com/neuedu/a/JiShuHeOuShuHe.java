package com.neuedu.a;

public class JiShuHeOuShuHe {
    //计算1-100间的奇数和偶数和
    public static void main(String[] args) {
        int a=0;
        for (int    ou=2;ou<=100;ou=ou+2){
            a=a+ou;
        }
        System.out.println("偶数和为："+a);
        for (int    ji=1;ji<=100;ji=ji+2){
            a=a+ji;
        }
        System.out.println("奇数和为："+a);
    }
}
