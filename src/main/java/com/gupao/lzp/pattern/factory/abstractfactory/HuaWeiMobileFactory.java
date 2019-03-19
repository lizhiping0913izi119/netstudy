package com.gupao.lzp.pattern.factory.abstractfactory;

public class HuaWeiMobileFactory extends AbstractMobileFactory {
    public HuaWeiMobileFactory() {
        System.out.println("huawei");
    }

    @Override
    IMobileCPU GetCPU() {
        return new MobileCPU();
    }

    @Override
    IPingMu GetPingMu() {
        return new PingMu();
    }

    @Override
    ISDKCard GetSDKCard() {
        return new SDkCard();
    }
}
