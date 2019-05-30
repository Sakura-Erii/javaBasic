package com.neuedu.$5_27;

public class TestChangFangXing {
    public static void main(String[] args) {
        //长方形无参
        System.out.println("无参的长方形");
        ChangFangXing wucan = new ChangFangXing();
        wucan.changfangxing1();
        //长方形一个参数
        System.out.println("一个参的长方形");
        ChangFangXing yigecanshu = new ChangFangXing();
        yigecanshu.changfangxing2(4);
        //长方形俩个参数
        System.out.println("俩个参的长方形");
        ChangFangXing liagecanshu = new ChangFangXing();
        liagecanshu.changfangxing3(5, 6);
    }
}
