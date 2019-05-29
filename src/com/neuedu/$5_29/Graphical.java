package com.neuedu.$5_29;

public class Graphical {
    //定义一个图形类
    //2 创建图形 圆形 正方形 有自己的属性 例如圆形的特征 都有半径 分别定义自己的计算面积和计算周长
    //3 创建main方法 进行测试 创建对象 调用方法计算面积和周长
    private double  radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "圆的面积为："+Math.PI+radius*radius+"  "+"圆的周长为："+2*Math.PI*radius+"  ";
    }
}
