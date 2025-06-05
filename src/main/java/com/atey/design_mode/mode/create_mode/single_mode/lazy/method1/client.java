package com.atey.design_mode.mode.create_mode.single_mode.lazy.method1;

public class client {
    public static void main(String[] args) {
        Single instance1 = Single.getInstance();
        Single instance2 = Single.getInstance();
        System.out.println(instance1 == instance2);
    }
}
