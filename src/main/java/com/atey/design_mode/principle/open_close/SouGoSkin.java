package com.atey.design_mode.principle.open_close;

public class SouGoSkin {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}
