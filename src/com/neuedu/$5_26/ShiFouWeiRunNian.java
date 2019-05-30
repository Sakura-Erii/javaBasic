package com.neuedu.$5_26;

import java.util.Scanner;

public class ShiFouWeiRunNian {
    //判断一个年份是否为闰年
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份");
        int a = input.nextInt();
        if (a <= 0) {
            System.out.println("请输入正确年份");
        } else if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println(a + "年，是润年");
        } else {
            System.out.println(a + "年，不是闰年，是平年");
        }
    }
}
