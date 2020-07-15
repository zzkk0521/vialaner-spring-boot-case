package com.master.factories;

public class Apple extends Fruit{

    @Override
    void color() {
        System.out.println("过去的人吃苹果...");
    }

    @Override
    void weight() {
        System.out.println("一个苹果大概有1两重...");
    }

}
