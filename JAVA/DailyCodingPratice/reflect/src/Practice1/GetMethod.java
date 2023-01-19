package Practice1;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class GetMethod {


    /*获取Method对象
      Method[] getMethods()  类中的所有公共的成员方法，包括继承过来的
      Method[] getDeclaredMethods() 类中所有的成员方法，不包括继承的
      Method getMethod(String name, Class<?>... parameterTypes) 单个的公共的成员方法
      Method getDeclaredMethod(String name, Class<?>... parameterTypes) 单个的不考虑修饰符的成员方法
      methodname.setAccessible(true) 取消访问检查
      methodname.invoke(obj,参数) 通过对象obj并使用参数执行方法


     */

        public static void main(String[] args) throws Exception  {
            Properties properties = new Properties();
            FileInputStream fis = new FileInputStream("reflect\\ClassName.properties");
            properties.load(fis);


            String className1 = properties.getProperty("className1");
            Class<?> c = Class.forName(className1);
            Constructor<?> declaredConstructor1 = c.getDeclaredConstructor(int.class);
            declaredConstructor1.setAccessible(true);
            Object o = declaredConstructor1.newInstance(1);


            System.out.println(c.getDeclaredMethod(properties.getProperty("methodName")));
            Method methodName = c.getDeclaredMethod(properties.getProperty("methodName"));
            //方法setAccessible(true)取消访问检查,可以执行私有方法;
            methodName.setAccessible(true);
            methodName.invoke((Testclass1)o);


        }
    }

