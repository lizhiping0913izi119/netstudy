package com.gupao.lzp.pattern.factory.factorymethod;

import com.gupao.lzp.pattern.factory.simplefactory.HuaWeiMobile;
import com.gupao.lzp.pattern.factory.simplefactory.IMobile;

public class HuaWeiFactory implements IMobileFactory {

    public IMobile create() {
        return  new HuaWeiMobile();
    }
}
