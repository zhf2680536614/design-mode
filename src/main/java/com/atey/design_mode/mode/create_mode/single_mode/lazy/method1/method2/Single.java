package com.atey.design_mode.mode.create_mode.single_mode.lazy.method1.method2;

//双重检查锁 优化读操作的性能
public class Single {
    private Single(){}

    //volatile保证有序性
    private static volatile Single instance;

    public static Single getInstance(){
        if(instance == null){
            synchronized(Single.class){
                if(instance == null){
                    instance = new Single();
                }
            }
        }
        return instance;
    }
}
