package com.atey.design_mode.mode.create_mode.factory.single_factory;

public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("american");
        coffee.getName();
    }
}
