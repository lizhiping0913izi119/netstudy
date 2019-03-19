package com.gupao.lzp.pattern.factory.simplefactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {

        //字符类型
//        Simplefactory simplefactory= new Simplefactory();
//        simplefactory.create("诺基亚");


//         Simplefactory simplefactory =new Simplefactory();
//         simplefactory.create("com.gupao.lzp.pattern.factory.simplefactory.XiaoMiMobile");


        Simplefactory simplefactory= new Simplefactory();
        simplefactory.create(HuaWeiMobile.class);


    }
}
