package com.master.factories;

public class BeforePersonFactory extends AbstractFactories{

    @Override
    Fruit createFruit() {
        return new Apple();//苹果
    }

    @Override
    Vehicle createVehicle() {
        return new Carriage();//马车
    }

    @Override
    Room createRoom() {
        return new Cave();//山洞
    }

}
