package com.neuedu.$5_27;

//定义长方形类，含：
//  特征：宽、高（整型）；
//  方法：求周长、面积；
//  方法3个：（1）无参——宽、高默认值为1；（2）1个参数——宽、高均为参数值；（3）2个参数——宽、高各为参数值。
//并对其进行测试
public class ChangFangXing {
    //无参
    public void changfangxing1() {
        int width = 1;
        int height = 1;
        System.out.println("周长为：" + (width + height) * 2);
        System.out.println("面积为：" + width * height);
    }

    //1个参数
    public void changfangxing2(int a) {
        int width = a;
        int height = a;
        System.out.println("周长为：" + (width + height) * 2);
        System.out.println("面积为：" + width * height);
    }

    //2个参数
    public void changfangxing3(int b, int c) {
        int width = b;
        int height = c;
        System.out.println("周长为：" + (width + height) * 2);
        System.out.println("面积为：" + width * height);
    }
}
