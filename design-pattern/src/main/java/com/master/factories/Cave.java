package com.master.factories;

public class Cave extends Room{//山洞

    @Override
    void size() {
        System.out.println("山洞可长可大了...");
    }

    @Override
    void location() {
        System.out.println("山洞位于北京市周口店龙骨山...");
    }

}
