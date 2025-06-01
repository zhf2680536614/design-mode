package com.atey.design_mode.mode.create_mode.single_mode.hunger.method1;

public class Single {
    private Single(){}

    private static Single instance = new Single();

    public static Single getInstance(){
        return instance;
    }
}
