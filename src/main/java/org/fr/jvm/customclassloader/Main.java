package org.fr.jvm.customclassloader;

/**
 * @author furao
 * @desc
 * @date 2021/5/31
 * @package org.fr.jvm.customclassloader
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //创建一个类加载器
        MyCustomClassLoader loader = new MyCustomClassLoader("/Users/furao/Documents/code/gitCode/design-pattern/target/classes/","myClassLoader");
        //使用创建的类加载器加载字节码文件
        Class<?> power = loader.findClass("org.fr.jvm.customclassloader.Power");
        Object o = power.newInstance();
        //实例化后的打印结果： power is loaded by MyCustomClassLoader{name='myClassLoader'}

        //使用默认的类加载器加载
        Power p1 = new Power();
        //实例化后的打印结果： power is loaded by sun.misc.Launcher$AppClassLoader@18b4aac2

        //System.out.println(System.getProperty("java.ext.dirs"));
    }


}
