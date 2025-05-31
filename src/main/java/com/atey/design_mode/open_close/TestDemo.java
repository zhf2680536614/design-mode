package com.atey.design_mode.open_close;

public class TestDemo {
    public static void main(String[] args) {
        SouGoSkin souGoSkin = new SouGoSkin();
        DefaultSkin defaultSkin = new DefaultSkin();
        souGoSkin.setSkin(defaultSkin);
        souGoSkin.display();
    }
}
