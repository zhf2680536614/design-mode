package com.atey.design_mode.mode.create_mode.factory.single_factory;

public class SingleCoffeeFactory {
    public Coffee createCoffee(String type){
        Coffee coffee = null;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else{
            throw new RuntimeException("该咖啡本店未上架");
        }

        return coffee;
    }
}
