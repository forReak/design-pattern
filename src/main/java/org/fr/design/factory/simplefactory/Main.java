package org.fr.design.factory.simplefactory;


/**
 * 主程序
 * @author furao
 * @desc
 * @date 2021/5/21
 * @package org.fr.design.factory.simplefactory
 */
public class Main {

    public static void main(String[] args) {
        //1、简单工厂模式：将创建类的工作交给工厂
        Car wuling = SimpleCarFactory.getCar("wuling");
        Car tesla = SimpleCarFactory.getCar("tesla");
        wuling.name();
        tesla.name();
    }
}
