package com.atey.design_mode.mode.create_mode.factory.single_factory;

public class CoffeeStore {
    public Coffee orderCoffee(String type){
        SingleCoffeeFactory singleCoffeeFactory = new SingleCoffeeFactory();
        Coffee coffee = singleCoffeeFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
