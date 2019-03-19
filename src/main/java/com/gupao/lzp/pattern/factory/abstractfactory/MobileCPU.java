package com.gupao.lzp.pattern.factory.abstractfactory;

public class MobileCPU implements  IMobileCPU{

    public MobileCPU() {
        System.out.println("cpu");
    }

    @Override
    public void run() {
        System.out.println("运行");
    }
}

