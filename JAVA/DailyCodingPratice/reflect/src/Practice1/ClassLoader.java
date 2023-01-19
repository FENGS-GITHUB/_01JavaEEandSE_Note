package Practice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ClassLoader {
    public static void main(String[] args) throws Exception {
        /*通过 properties数组和输入流读取配置文件数据
        *  这种方法在修改类时仅仅修改配置文件即可
        * */
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("reflect\\ClassName.properties");
        properties.load(fis);
        /*通过配置文件获取类名*/
        System.out.println(Class.forName(properties.getProperty("className1")));
        System.out.println(Class.forName(properties.getProperty("className2")));


        /*直接通过类名来获取Class类对象*/
        Class<Testclass1> testclass1Class = Testclass1.class;
        Class<Testclass2> testclass2Class = Testclass2.class;
        System.out.println(testclass1Class);
        System.out.println(testclass2Class);


    }

}
