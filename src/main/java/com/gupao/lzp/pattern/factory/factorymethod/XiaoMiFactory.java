package com.gupao.lzp.pattern.factory.factorymethod;

import com.gupao.lzp.pattern.factory.simplefactory.IMobile;
import com.gupao.lzp.pattern.factory.simplefactory.XiaoMiMobile;

public class XiaoMiFactory implements  IMobileFactory {

    public IMobile create() {
        return new XiaoMiMobile();
    }
}
