package com.neuedu.$5_27;

import java.util.Scanner;

public class TestYuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入半径");
        int a = input.nextInt();
        Yuan test = new Yuan();
        test.radius(a);
    }
}
