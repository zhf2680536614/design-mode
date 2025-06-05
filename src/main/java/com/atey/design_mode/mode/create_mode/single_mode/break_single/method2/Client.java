package com.atey.design_mode.mode.create_mode.single_mode.break_single.method2;

//反射会破坏单例模式

import java.lang.reflect.Constructor;

public class Client {
    public static void main(String[] args) throws Exception{
        Class<Single> clazz = Single.class;
        Constructor<Single> declaredConstructor = clazz.getDeclaredConstructor();
        //跳过权限检查
        declaredConstructor.setAccessible(true);
        Single instance1 = declaredConstructor.newInstance();
        Single instance2 = declaredConstructor.newInstance();
        System.out.println(instance1 == instance2);
    }
}
