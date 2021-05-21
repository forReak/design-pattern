package org.fr.design.factory.simplefactory;

import org.fr.design.factory.simplefactory.vo.DataSource;

/**
 * 主程序
 * @author furao
 * @desc
 * @date 2021/5/21
 * @package org.fr.design.factory.simplefactory
 */
public class Client {

    //1、简单工厂模式：将创建类的工作交给工厂
    public static void main(String[] args) {
        //2、新建简单工厂
        DataSource control = DataSourceFactory.getDataSource("control");
        DataSource power = DataSourceFactory.getDataSource("power");
        //3、使用工厂创建的类
        control.printDeviceName();
        power.printDeviceName();
    }
}
