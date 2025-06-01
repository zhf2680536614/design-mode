package com.atey.design_mode.principle.open_close;

public class DefaultSkin extends AbstractSkin {
    @Override
    public void display() {
        System.out.println("默认皮肤展示");
    }
}
