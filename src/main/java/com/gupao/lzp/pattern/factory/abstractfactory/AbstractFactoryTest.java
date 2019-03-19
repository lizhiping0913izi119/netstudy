package com.gupao.lzp.pattern.factory.abstractfactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {

        AbstractMobileFactory abstractMobileFactory =new HuaWeiMobileFactory();
        abstractMobileFactory.GetCPU();
        abstractMobileFactory.GetPingMu();
        abstractMobileFactory.GetSDKCard();
    }
}
