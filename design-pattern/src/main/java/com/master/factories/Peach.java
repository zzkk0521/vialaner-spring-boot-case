package com.master.factories;

public class Peach extends Fruit{

    @Override
    void color() {
        System.out.println("现在的人吃桃子...");
    }

    @Override
    void weight() {
        System.out.println("一个桃子大概有2两重...");
    }

}
