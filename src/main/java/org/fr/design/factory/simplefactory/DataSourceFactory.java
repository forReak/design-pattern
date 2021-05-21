package org.fr.design.factory.simplefactory;

import org.fr.design.factory.simplefactory.vo.ControlDataSource;
import org.fr.design.factory.simplefactory.vo.DataSource;
import org.fr.design.factory.simplefactory.vo.PowerDataSource;

/**
 * 一个简单工厂，创建类的工作由简单工厂来进行创建
 */
public class DataSourceFactory {

    public static DataSource getDataSource(String type){
        switch (type){
            case "control" : return new ControlDataSource();
            case "power" : return new PowerDataSource();
            default:
        }
        return null;
    }
}
