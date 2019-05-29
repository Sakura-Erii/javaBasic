package com.neuedu.$5_29;

import java.util.Scanner;

public class TestGraphical {
    public static void main(String[] args) {
        Graphical   graphical=new Graphical();
        Scanner input=new Scanner(System.in);
        System.out.println("输入圆的半径");
        double radius=input.nextDouble();
        graphical.setRadius(radius);
        System.out.println(graphical.toString());

        System.out.println("输入正方形的边长");
        double width=input.nextDouble();
        ZhengFangXing   zhengFangXing=new ZhengFangXing();
        zhengFangXing.zhengfangxing(width);
    }
}
