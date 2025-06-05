package com.atey.design_mode.mode.create_mode.single_mode.break_single.method1;
import java.io.Serial;
import java.io.Serializable;

//静态内部类的方式，因为JVM在加载外部类时不会加载内部类，只有内部类的方法或属性被调用时才会加载
public class Single implements Serializable {
    private Single(){}

    private static class SingleHolder{
        private static final Single INSTANCE = new Single();
    }

    public static Single getInstance(){
        return SingleHolder.INSTANCE;
    }

    //序列化和反序列化破快单例模式的解决方案 => readResolve()在反序列化时会被执行
    @Serial
    private Object readResolve(){
        return SingleHolder.INSTANCE;
    }
}
