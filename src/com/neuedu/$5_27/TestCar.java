package com.neuedu.$5_27;

public class TestCar {
    public static void main(String[] args) {
        Car aodi=new Car();
        aodi.emmm("奥迪",1000000);
        aodi.driver();
        aodi.speedChange(100);
        System.out.println("--------------下一个----------------");
        Car benchi= new Car();
        aodi.emmm("奔驰",112000);
        aodi.driver();
        aodi.speedChange(120);
    }
}
