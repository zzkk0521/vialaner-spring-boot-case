package com.master.factories;

public class Aerocraft extends Vehicle{//飞行器

    @Override
    void wheelCount() {
        System.out.println("飞行器没有轮子...");
    }

    @Override
    void type() {
        System.out.println("中国制造飞行器...");
    }

    @Override
    void speed() {
        System.out.println("飞行器时速100公里每小时...");
    }

}
