package com.neuedu.$5_31;

import java.util.Scanner;

public class TestGhostValleyConjecture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个数");
        int num = input.nextInt();
        GhostValleyConjecture ghostValleyConjecture = new GhostValleyConjecture();
        ghostValleyConjecture.setNnum(num);
        ghostValleyConjecture.guigu();
    }
}
