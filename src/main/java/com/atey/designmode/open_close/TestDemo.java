package com.atey.designmode.open_close;

/**
 * 软件设计模式
 *  开闭原则
 *      扩展开放，修改关闭
 */
public class TestDemo {
    public static void main(String[] args) {
        SouGoSkin souGoSkin = new SouGoSkin();
        DefaultSkin defaultSkin = new DefaultSkin();
        souGoSkin.setSkin(defaultSkin);
        souGoSkin.display();
    }
}
