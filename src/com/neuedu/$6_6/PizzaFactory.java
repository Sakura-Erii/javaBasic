package com.neuedu.$6_6;

import java.util.Scanner;

public class PizzaFactory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入披萨名字");
        String BaconPizzaName = input.next();
        System.out.println("输入披萨大小");
        double BaconPizzaSize = input.nextDouble();
        System.out.println("输入披萨价格");
        double BaconPizzaPrice = input.nextDouble();
        Pizza pizza1 = new BaconPizza();
        pizza1.setName(BaconPizzaName);
        pizza1.setPrice(BaconPizzaPrice);
        pizza1.setSize(BaconPizzaSize);
        System.out.println("输入披萨名字");
        String BaconPizzaName1 = input.next();
        System.out.println("输入披萨大小");
        double BaconPizzaSize1 = input.nextDouble();
        System.out.println("输入披萨价格");
        double BaconPizzaPrice1 = input.nextDouble();
        ((BaconPizza) pizza1).show();
        Pizza pizza2 = new SeaPizza();
        pizza2.setName(BaconPizzaName1);
        pizza2.setPrice(BaconPizzaPrice1);
        pizza2.setSize(BaconPizzaSize1);
        ((BaconPizza) pizza2).show();
    }
}