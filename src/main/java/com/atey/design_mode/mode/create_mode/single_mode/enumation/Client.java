package com.atey.design_mode.mode.create_mode.single_mode.enumation;

public class Client {
    public static void main(String[] args) {
        //通过枚举方式创建单列对象
        Single single1 = Single.SINGLE;
        Single single2 = Single.SINGLE;
        System.out.println(single1 == single2);
    }
}
