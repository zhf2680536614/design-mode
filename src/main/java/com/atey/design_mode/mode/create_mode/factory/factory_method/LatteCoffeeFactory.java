package com.atey.design_mode.mode.create_mode.factory.factory_method;

public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
