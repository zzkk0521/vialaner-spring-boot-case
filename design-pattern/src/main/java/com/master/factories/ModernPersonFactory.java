package com.master.factories;

public class ModernPersonFactory extends AbstractFactories{

    @Override
    Fruit createFruit() {
        return new Peach();//桃子
    }

    @Override
    Vehicle createVehicle() {
        return new Train();//火车
    }

    @Override
    Room createRoom() {
        return new Villa();//平房
    }

    T createT() {
        return new Tt();
    }

}
