package com.master.factories;

public class Carriage extends Vehicle{//马车

    @Override
    void wheelCount() {
        System.out.println("马车只有两个轮子...");
    }

    @Override
    void type() {
        System.out.println("皇家马车...");
    }

    @Override
    void speed() {
        System.out.println("马车时速10公里每小时...");
    }

}
