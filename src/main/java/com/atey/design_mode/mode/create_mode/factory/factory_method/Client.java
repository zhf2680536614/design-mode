package com.atey.design_mode.mode.create_mode.factory.factory_method;

public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        CoffeeFactory coffeeFactory = new AmericanCoffeeFactory();
        coffeeStore.setCoffeeFactory(coffeeFactory);
        Coffee coffee = coffeeStore.orderCoffee();
        coffee.getName();
    }
}
