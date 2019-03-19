package com.gupao.lzp.pattern.factory.abstractfactory;

public class PingMu  implements  IPingMu{

    public PingMu() {
        System.out.println("屏幕");
    }


    @Override
    public void show() {
        System.out.println("显示");
    }
}
