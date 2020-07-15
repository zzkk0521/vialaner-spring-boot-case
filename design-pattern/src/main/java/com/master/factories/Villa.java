package com.master.factories;

public class Villa extends Room {//别墅

    @Override
    void size() {
        System.out.println("别墅有2000平方米...");
    }

    @Override
    void location() {
        System.out.println("别墅位于富平华朱东新村...");
    }

}
