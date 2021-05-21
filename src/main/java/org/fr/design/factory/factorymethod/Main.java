package org.fr.design.factory.factorymethod;

/**
 * @author furao
 * @desc
 * @date 2021/5/21
 * @package org.fr.design.factory.factorymethod
 */
public class Main {
    public static void main(String[] args) {
        //1、创建各个车的工厂，通过工厂获取车 工厂只需要进行getCar就行。
        Car car = new TeslaFactory().getCar();
        Car car1 = new WulingFactory().getCar();

        car.name();
        car1.name();
    }
}
