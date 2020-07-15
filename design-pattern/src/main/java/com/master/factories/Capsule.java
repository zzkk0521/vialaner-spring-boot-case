package com.master.factories;

public class Capsule extends Room{//胶囊

    @Override
    void size() {
        System.out.println("胶囊有8个平方那么大...");
    }

    @Override
    void location() {
        System.out.println("胶囊岁随处可见...");
    }

}
