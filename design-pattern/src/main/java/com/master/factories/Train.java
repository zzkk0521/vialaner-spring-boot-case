package com.master.factories;

public class Train extends Vehicle{

    @Override
    void wheelCount() {
        System.out.println("火车有好多轮子...");
    }

    @Override
    void type() {
        System.out.println("绿皮火车...");
    }

    @Override
    void speed() {
        System.out.println("火车时速30公里每小时...");
    }

}
