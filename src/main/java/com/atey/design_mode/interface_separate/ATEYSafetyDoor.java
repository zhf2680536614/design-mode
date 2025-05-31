package com.atey.design_mode.interface_separate;

import com.atey.design_mode.interface_separate.service.AntiTheft;
import com.atey.design_mode.interface_separate.service.Fireproof;
import com.atey.design_mode.interface_separate.service.Waterproof;

public class ATEYSafetyDoor implements AntiTheft, Waterproof, Fireproof {
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireproof() {
        System.out.println("防火");
    }

    @Override
    public void waterproof() {
        System.out.println("防水");
    }
}
