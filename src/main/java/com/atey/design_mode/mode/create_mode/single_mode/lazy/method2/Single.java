package com.atey.design_mode.mode.create_mode.single_mode.lazy.method2;
// 懒汉式：只有被使用时创建
public class Single {
    //私有构造方法
    private Single(){}

    private static Single single;

    //添加同步锁，解决懒汉式引发的线程安全问题
    public static synchronized Single getInstance(){
        if(single == null){
            single = new Single();
        }
        return single;
    }
}
