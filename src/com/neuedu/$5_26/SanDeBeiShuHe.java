package com.neuedu.$5_26;

public class SanDeBeiShuHe {
    //用while循环，计算计算1-200之间所有3的倍数的和
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i < +200) {
            if (i % 3 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("1-200内所有三的倍数和为：" + sum);
    }
}
