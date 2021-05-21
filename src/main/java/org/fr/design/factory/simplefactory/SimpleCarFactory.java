package org.fr.design.factory.simplefactory;

/**
 * @author furao
 * @desc
 * @date 2021/5/21
 * @package org.fr.design.factory.simplefactory
 */
public class SimpleCarFactory {
    public static Car getCar(String type){
        switch (type){
            case "wuling":return new Wuling();
            case "tesla":return new Tesla();
            default:return null;
        }
    }
}
