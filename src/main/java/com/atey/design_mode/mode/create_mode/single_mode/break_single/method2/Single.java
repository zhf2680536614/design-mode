package com.atey.design_mode.mode.create_mode.single_mode.break_single.method2;

import java.io.Serializable;

//静态内部类的方式，因为JVM在加载外部类时不会加载内部类，只有内部类的方法或属性被调用时才会加载
public class Single implements Serializable {

    //用来标记该类的对象是否已经被创建
    private static boolean flag = false;

    private Single() {
        synchronized (Single.class) {
            if (flag) {
                throw new RuntimeException("该类只允许创建一个对象");
            }
            flag = true;
        }
    }

    private static class SingleHolder {
        private static final Single INSTANCE = new Single();
    }

    public static Single getInstance() {
        return SingleHolder.INSTANCE;
    }
}
