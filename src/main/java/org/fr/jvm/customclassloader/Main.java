package org.fr.jvm.customclassloader;

/**
 * @author furao
 * @desc
 * @date 2021/5/31
 * @package org.fr.jvm.customclassloader
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyCustomClassLoader loader = new MyCustomClassLoader("myClassLoader");
        //目录下已经有.class 文件
        Class<?> power = loader.findClass("org.fr.jvm.customclassloader.Power");
        Object o = power.newInstance();

    }
}
