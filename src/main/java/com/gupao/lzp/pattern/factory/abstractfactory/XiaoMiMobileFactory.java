package com.gupao.lzp.pattern.factory.abstractfactory;

public class XiaoMiMobileFactory extends  AbstractMobileFactory {
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
