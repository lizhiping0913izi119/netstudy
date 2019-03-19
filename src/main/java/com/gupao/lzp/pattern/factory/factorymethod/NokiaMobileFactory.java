package com.gupao.lzp.pattern.factory.factorymethod;

import com.gupao.lzp.pattern.factory.simplefactory.IMobile;
import com.gupao.lzp.pattern.factory.simplefactory.NokiaMobile;

public class NokiaMobileFactory implements  IMobileFactory {

    public IMobile create() {
        return new NokiaMobile();
    }

}
