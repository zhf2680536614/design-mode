package com.atey.design_mode.dependent_reverse.impl;

import com.atey.design_mode.dependent_reverse.service.Cpu;

public class IntelCpu implements Cpu {
    @Override
    public void run() {
        System.out.println("IntelCpu运行");
    }
}
