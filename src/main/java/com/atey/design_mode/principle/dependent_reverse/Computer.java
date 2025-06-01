package com.atey.design_mode.principle.dependent_reverse;

import com.atey.design_mode.principle.dependent_reverse.service.Cpu;
import com.atey.design_mode.principle.dependent_reverse.service.HardDisk;
import com.atey.design_mode.principle.dependent_reverse.service.Memory;

public class Computer {
    private Cpu cpu;
    private Memory memory;
    private HardDisk hardDisk;

    public Computer(){}

    public Computer(Cpu cpu, Memory memory, HardDisk hardDisk) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDisk = hardDisk;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void run(){
        hardDisk.get();
        memory.save();
        cpu.run();
        hardDisk.save();
    }
}
