package org.fr.jvm.customclassloader;

/**
 * @author furao
 * @desc
 * @date 2021/5/31
 * @package org.fr.jvm.customclassloader
 */
public class Power {

    public Power() {
        System.out.println("power is loaded by "+this.getClass().getClassLoader());
    }
}
