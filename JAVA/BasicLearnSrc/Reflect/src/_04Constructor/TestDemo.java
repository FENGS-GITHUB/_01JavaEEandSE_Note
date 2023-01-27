package _04Constructor;
/*
* Constructor对象:构造方法对象
* 创建方法:
*   1类对象调用getConstructor(参数列表字节码对象)获取特定参数的 公共 构造方法对象
*   2类对象调用getConstructors()获取所有公共构造方法对象 并返回一个构造方法对象数组
*   3类对象调用getDeclaredConstructor(参数列表字节码对象) 获取所有权限 的 特定参数列表 的构造方法对象
*   4类对象调用getDeclaredConstructors() 获取 所有权限 的构造方法对象 返回一个构造方法对象数组
*
* 创建实例对象:
*   调用newInstance()方法来创建一个该类的实例化对象,参数为该构造方法的参数
*   对于私有的构造器对象,需要设定setAccessible(true)
*
* 获取这个构造器对象的类对象:
*   调用getDeclaringClass()方法
 * */



import java.lang.reflect.Constructor;

public class TestDemo {
    public static void main(String[] args) throws Exception{
        Class testclass=TestClass.class;
        Constructor constructor1=testclass.getConstructor();
        Constructor constructor2=testclass.getConstructor(int.class,int.class,String.class);
        Constructor constructor3=testclass.getDeclaredConstructor(int.class);
        /*两个不同参数列表的同一类构造方法,在虚拟机内存中处于同一位置,引用为同一地址的Constructor对象*/
        System.out.println(constructor2.hashCode());
        System.out.println(constructor1.hashCode());
        System.out.println(constructor1.getDeclaringClass());


        Object object1= constructor1.newInstance();
        Object object2= constructor2.newInstance(1,2,"aaa");

        System.out.println("创建了两个实例对象分别为:");
        System.out.println(object1.toString());
        System.out.println(object2.toString());

        /*私有构造方法对象需要设定:setAccessible(true)
        * 才能够使用,来创建实例对象
        * */
        try{
            //constructor3.setAccessible(true);
            Object object3= constructor3.newInstance(1);}
        catch (IllegalAccessException e) {
            System.out.println(e.toString());
            System.out.println("私有化构造方法对象无法直接使用");
            constructor3.setAccessible(true);

            }

        Object object3= constructor3.newInstance(1);
        System.out.println(object3.toString());


        }


    }

