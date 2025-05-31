package com.atey.design_mode.interface_separate;

/**
 * 接口隔离原则
 *  客户端不应该被迫依赖于他不使用的方法
 *  一个类对另一个类的依赖应该建立在最小的接口上
 */

public class ClientDemo {
    public static void main(String[] args) {
        ATEYSafetyDoor safetyDoor = new ATEYSafetyDoor();
        safetyDoor.antiTheft();
        safetyDoor.fireproof();
    }
}
