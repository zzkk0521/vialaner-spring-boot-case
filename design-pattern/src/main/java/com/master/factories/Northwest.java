package com.master.factories;

import com.master.factories.Fruit;

public class Northwest extends Fruit {

    @Override
    void color() {
        System.out.println("未来的人吃西北风...");
    }

    @Override
    void weight() {
        System.out.println("西北风重量几乎可以忽略不计...");
    }

}
