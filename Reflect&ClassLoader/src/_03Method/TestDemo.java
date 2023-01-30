package _03Method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
* Method对象的作用:
*   调用对应的方法
*
* 创建Method对象的方法:
*   Class类对象调用getMethod(方法名, 形参列表) 返回指定public方法对象
*   Class类对象调用getDeclaredMethod(方法名, 形参列表) 返回任意权限方法对象
*       因为类中成员方法存在重载的情况
*       所以确定特定方法需要确定其方法名和形参列表
*   Class类对象调用getMethods()可以获取一个Method类对象数组
*
*
* 通过Method对象调用方法:
*   Method对象调用invoke(对象名, 方法实参)方法来执行方法
*
* */
public class TestDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object testobject=new TestClass(1,2,"AAA");
        Class C1=TestClass.class;
        Method getmethod1=C1.getMethod("getName");
        Method privateTestMethod1 = C1.getDeclaredMethod("privateTestMethod1", int.class, int.class);
        try{
            System.out.println("==================================");
            //privateTestMethod1.setAccessible(true);
            /*未设定setAccessible(true),访问私有方法会出现IllegalAccessException异常*/
            privateTestMethod1.invoke(testobject,1,2);
        }
        catch (IllegalAccessException e){
            System.out.println("由于未设定setAccessible(true)无法访问");
            System.out.println("==================================");
        }
        /*设定权限setAccessible(true)
        * 此时成功访问private方法
        * */
        privateTestMethod1.setAccessible(true);
        privateTestMethod1.invoke(testobject,1,2);



    }
}
