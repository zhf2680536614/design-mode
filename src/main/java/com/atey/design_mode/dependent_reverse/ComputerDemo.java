package com.atey.design_mode.dependent_reverse;

import com.atey.design_mode.dependent_reverse.impl.IntelCpu;
import com.atey.design_mode.dependent_reverse.impl.KingstonMemory;
import com.atey.design_mode.dependent_reverse.impl.XiJieHardDisk;
import com.atey.design_mode.dependent_reverse.service.Cpu;
import com.atey.design_mode.dependent_reverse.service.HardDisk;
import com.atey.design_mode.dependent_reverse.service.Memory;

/**
 * 依赖反转原则
 *  高层模块不应该依赖底层模块，两个都应该依赖其抽象
 *  抽象（抽象父类 | 接口）不应该依赖细节（实现）
 *  细节（实现）应该依赖抽象（抽象父类 | 接口）
 */

public class ComputerDemo {
    public static void main(String[] args) {
        Cpu c = new IntelCpu();
        Memory m = new KingstonMemory();
        HardDisk h = new XiJieHardDisk();

        Computer computer = new Computer(c, m, h);
        computer.run();
    }
}
