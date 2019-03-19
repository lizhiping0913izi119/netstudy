package com.gupao.lzp.pattern.factory.factorymethod;

public class FactoryMethodTest {
    public static void main(String[] args) {

        XiaoMiFactory xiaoMiFactory =new XiaoMiFactory();
        xiaoMiFactory.create();

        HuaWeiFactory huaWeiFactory =new HuaWeiFactory();
        huaWeiFactory.create();


    }
}
