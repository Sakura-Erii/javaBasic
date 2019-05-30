package com.neuedu.$5_26;

import java.util.Scanner;

public class ZuoYeChengJi {
    //题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下 的用C表示。
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 60 && score <= 89) {
            System.out.println("B");
        } else if (score >= 0 && score < 60) {
            System.out.println("C");
        } else {
            System.out.println("成绩输入无效，请重新输入");
        }
    }
}