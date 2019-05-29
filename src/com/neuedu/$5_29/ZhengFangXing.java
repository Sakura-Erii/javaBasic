package com.neuedu.$5_29;

public class ZhengFangXing {
    private double  width;
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void zhengfangxing(double width){
        this.width=width;
        System.out.println("正方形的面积为："+width*width+"  "+"正方形的周长为："+4*width+"  ");
    }
}
