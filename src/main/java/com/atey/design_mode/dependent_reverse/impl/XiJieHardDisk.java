package com.atey.design_mode.dependent_reverse.impl;

import com.atey.design_mode.dependent_reverse.service.HardDisk;

public class XiJieHardDisk implements HardDisk {
    @Override
    public void save() {
        System.out.println("希捷硬盘保存数据");
    }

    @Override
    public String get() {
        System.out.println("希捷硬盘获取数据");
        return "数据";
    }
}
