package com.master.factory.abstractfactory;

/**
 * 抽象工厂在产品一族扩展很方便
 */
public class Main {

    public static void main(String[] args) {

//        Car c = new Car();
//        c.go();
//
//        AK47 w = new AK47();
//        w.shoot();
//
//        Bread b = new Bread();
//        b.printName();

        //现代族
        AbstractFactory f = new ModernFactory();
        Vehicle car = f.createVehicle();
        car.go();
        Food bread = f.createFood();
        bread.printName();
        Weapon ak47 = f.createWeapon();
        ak47.shoot();

        //魔法族
        AbstractFactory m = new MagicFactory();
        Vehicle magicStisk = m.createVehicle();
        magicStisk.go();
        Food mushRoom = m.createFood();
        mushRoom.printName();
        Weapon broom = f.createWeapon();
        broom.shoot();
    }

}
