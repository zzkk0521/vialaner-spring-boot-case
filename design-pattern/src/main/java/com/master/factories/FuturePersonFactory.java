package com.master.factories;

public class FuturePersonFactory extends AbstractFactories{

    @Override
    Fruit createFruit() {
        return new Northwest();//西北风
    }

    @Override
    Vehicle createVehicle() {
        return new Aerocraft();//飞行器
    }

    @Override
    Room createRoom() {
        return new Capsule();//胶囊
    }

}
