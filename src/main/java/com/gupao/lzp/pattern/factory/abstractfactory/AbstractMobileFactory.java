package com.gupao.lzp.pattern.factory.abstractfactory;

public abstract class AbstractMobileFactory {
    public AbstractMobileFactory() {
        System.out.println("abstractMobile");
    }

    abstract  IMobileCPU  GetCPU();

    abstract  IPingMu   GetPingMu();

    abstract  ISDKCard  GetSDKCard();

}
