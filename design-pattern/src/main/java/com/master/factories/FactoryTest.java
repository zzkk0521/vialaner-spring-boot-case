package com.master.factories;

public class FactoryTest {

    public static void main(String[] args) {
        System.out.println("-------------BeforePersonFactory BEGIN*************");
        AbstractFactories before = new BeforePersonFactory();
        Fruit apple = before.createFruit();//苹果
        apple.color();
        apple.weight();
        Room cave = before.createRoom();//山洞
        cave.size();
        cave.location();
        Vehicle carriage = before.createVehicle();//马车
        carriage.wheelCount();
        carriage.type();
        carriage.speed();
        System.out.println("-------------BeforePersonFactory END*************");

        System.out.println("\n");
        System.out.println("######################################################################################");

        System.out.println("*************ModernPersonFactory BEGIN*************");
        AbstractFactories modern = new ModernPersonFactory();
        Fruit peach = modern.createFruit();//桃子
        peach.color();
        peach.weight();
        Room villa = modern.createRoom();//别墅
        villa.size();
        villa.location();
        Vehicle train = modern.createVehicle();//火车
        train.wheelCount();
        train.type();
        train.speed();
        System.out.println("*************ModernPersonFactory END*************");

        System.out.println("\n");
        System.out.println("######################################################################################");

        System.out.println("=============FuturePersonFactory BEGIN=============");
        AbstractFactories future = new FuturePersonFactory();
        Fruit northwest = future.createFruit();//西北风
        northwest.color();
        northwest.weight();
        Room capsule = future.createRoom();//胶囊
        capsule.size();
        capsule.location();
        Vehicle areocraft = future.createVehicle();//飞行器
        areocraft.wheelCount();
        areocraft.type();
        areocraft.speed();
        System.out.println("=============FuturePersonFactory END=============");
    }
}
