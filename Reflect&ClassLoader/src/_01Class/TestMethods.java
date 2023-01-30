package _01Class;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestMethods {
    static void getInformations(Class C1){
        /*
        * getModifiers()获取权限修饰符
        * getSuperclass()获取父类对象名 返回值为父类的Class对象
        * getSimpleName()获取简易类名
        * getName()获取全类名
        * */
        System.out.println("=========类对象:"+C1.getSimpleName()+".class========");
        System.out.println("该类的修饰符"+C1.getModifiers());
        System.out.println("继承的父类有"+C1.getSuperclass());
        System.out.println("简易类名是"+C1.getSimpleName());
        System.out.println("全类名是"+C1.getName());
        System.out.println("该类实现接口有:");

        Class[] interfaces = C1.getInterfaces();
        for( Class cls : interfaces ){
            System.out.println( cls.getSimpleName() );
        }
        System.out.println("==============================");


    }

    static void getpublicFields(Class C1) throws Exception {
        /*通过类对象获取Field对象只能够获取公共对象*/
        System.out.println("=============获取指定字段名的public的Field对象");
        Field temp1 = C1.getField("TEMP");
        System.out.println(temp1.toString());
        System.out.println("=============获取所有的public的Field对象");
        Field[] temp2= C1.getFields();
        for (Field f:temp2
        ) {
            System.out.println(f.toString());
        }

    }

    static void getpublicMethods(Class C1) throws Exception {
        /*通过类对象获取Field对象只能够获取公共对象*/
        System.out.println("=============获取指定字段名的public的Method对象");
        Method setTel = C1.getMethod("setTel", int.class);
        System.out.println(setTel.toString());
            System.out.println("=============获取所有的public的Method对象");
        Method[] methods= C1.getMethods();
        for (Method method:methods
        ) {
            System.out.println(method.toString());
        }

    }


}

