package com.atey.design_mode.mode.create_mode.single_mode.hunger.method2;

public class Single {
    private Single(){}

    private static Single instance;

    static{
        instance = new Single();
    }

    public static Single getInstance(){
        return instance;
    }
}
