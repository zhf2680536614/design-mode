package com.atey.design_mode.dependent_reverse;

import com.atey.design_mode.dependent_reverse.impl.IntelCpu;
import com.atey.design_mode.dependent_reverse.impl.KingstonMemory;
import com.atey.design_mode.dependent_reverse.impl.XiJieHardDisk;
import com.atey.design_mode.dependent_reverse.service.Cpu;
import com.atey.design_mode.dependent_reverse.service.HardDisk;
import com.atey.design_mode.dependent_reverse.service.Memory;

public class ComputerDemo {
    public static void main(String[] args) {
        Cpu c = new IntelCpu();
        Memory m = new KingstonMemory();
        HardDisk h = new XiJieHardDisk();

        Computer computer = new Computer(c, m, h);
        computer.run();
    }
}
