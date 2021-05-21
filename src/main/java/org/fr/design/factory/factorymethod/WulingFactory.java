package org.fr.design.factory.factorymethod;

/**
 * @author furao
 * @desc
 * @date 2021/5/21
 * @package org.fr.design.factory.factorymethod
 */
public class WulingFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Wuling();
    }
}
