package com.master.factory.factorymethod;

/**
 * 产品维度扩展很方便
 */
public class Main {

    public static void main(String[] args) {
//        Car c = new Car();
//        c.go();

//        Plane p = new Plane();
//        p.go();

//        Moveable m = new Plane();
//        m.go();

//        Moveable m = new Broom();
//        m.go();

        Moveable m = new CarFactory().createCar();
        m.go();
    }

}
