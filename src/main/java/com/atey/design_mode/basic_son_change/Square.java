package com.atey.design_mode.basic_son_change;

import com.atey.design_mode.basic_son_change.service.Quadrilateral;

public class Square implements Quadrilateral {

    private double side;

    void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
