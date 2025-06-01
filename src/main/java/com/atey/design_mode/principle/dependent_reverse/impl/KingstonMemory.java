package com.atey.design_mode.principle.dependent_reverse.impl;

import com.atey.design_mode.principle.dependent_reverse.service.Memory;

public class KingstonMemory implements Memory {
    @Override
    public void save() {
        System.out.println("内存条保存数据");
    }
}
