package org.fr.jvm.customclassloader;

import java.io.*;

/**
 * @author furao
 * @desc
 * @date 2021/5/31
 * @package org.fr.jvm.customclassloader
 */
public class MyCustomClassLoader extends ClassLoader{
    private String path;    //默认加载路径

    private String name;                    //类加载器名称

    private final String  filetype=".class"; //文件类型



    public MyCustomClassLoader(String path,String name) {
        super();
        this.path = path;
        this.name = name;
    }

    public MyCustomClassLoader(ClassLoader parent, String name) {
        super(parent);
        this.name = name;
    }





    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "MyCustomClassLoader{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] bytes = loadClassData(name);
        return defineClass(name, bytes, 0, bytes.length);
    }

    /**
     * 自定义读取文件输入方法
     * @param name
     * @return
     */
    private byte[] loadClassData(String name){
        byte[] data=null;
        InputStream in=null;
        name=name.replace('.', '/');
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        try {
            in=new FileInputStream(new File(path+name+filetype));
            int len=0;
            while(-1!=(len=in.read())){
                out.write(len);
            }
            data=out.toByteArray();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return data;
    }
}
