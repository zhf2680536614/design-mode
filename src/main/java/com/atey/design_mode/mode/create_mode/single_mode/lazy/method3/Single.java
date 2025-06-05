package com.atey.design_mode.mode.create_mode.single_mode.lazy.method3;

//静态内部类的方式，因为JVM在加载外部类时不会加载内部类，只有内部类的方法或属性被调用时才会加载
public class Single {
    private Single(){}

    private static class SingleHolder{
        private static final Single INSTANCE = new Single();
    }

    public static Single getInstance(){
        return SingleHolder.INSTANCE;
    }
}
