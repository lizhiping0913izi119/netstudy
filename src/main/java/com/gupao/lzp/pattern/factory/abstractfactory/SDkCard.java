package com.gupao.lzp.pattern.factory.abstractfactory;

public class SDkCard implements ISDKCard {
    public SDkCard() {
        System.out.println("SDKCard");
    }

    @Override
    public void save() {
        System.out.println("存储");
    }
}
