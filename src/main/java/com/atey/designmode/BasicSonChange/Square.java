package com.atey.designmode.BasicSonChange;

public class Square implements Quadrilateral{

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
