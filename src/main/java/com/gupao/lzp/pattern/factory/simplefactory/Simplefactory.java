package com.gupao.lzp.pattern.factory.simplefactory;

public class Simplefactory {

//    /**
//     * 类型判断创建
//     * @param mobileType
//     * @return
//     */
//    public  IMobile create(String mobileType) {
//        if ("诺基亚".equals(mobileType)) {
//            return new NokiaMobile();
//
//        } else if ("华为".equals(mobileType)) {
//            return new HuaWeiMobile();
//
//        } else if ("小米".equals(mobileType)) {
//            return new XiaoMiMobile();
//        }
//        return null;
//    }

//    /**
//     * 根据类名创建
//     *
//     * @param className
//     * @return
//     */
//    public IMobile create(String className) {
//        try {
//            if (null != className && !"".equals(className)) {
//                return (IMobile) Class.forName(className).newInstance();
//            }
//        } catch (Exception ex) {
//
//        }
//        return null;
//    }


    public IMobile create(Class<? extends IMobile> clazz) {
        try {
            if (null != clazz)
                return clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
