package _02Field;

import java.io.File;
import java.lang.reflect.Field;

/*
* Field类对象是类中特定字段名的属性的字节码对象
*   其特性:
*       固定了字段名(哪个属性)
*       可以对 对象 的该字段名(该属性)进行读写操作
*
* 获取Field对象的方法:
*   通过类对象调用getDeclaredField(字段名)获取指定字段的Field对象
*
* Field类对象能做什么:
*   PS:要想设置私有对象的值,必须设定取消访问检查
*   通过方法:setAccessible(true)实现
*   1给对象设置对应字段名属性的值set(对象名, 字段值);
*   2获取对象对应该字段名属性的值get(对象名);
*
*
* */
public class TestDemo {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException {

        /*两种方法获取Field对象*/
        Class C1=TestClass.class;
        Object o = C1.newInstance();
        Field field= C1.getDeclaredField("ID");
        TestClass o1=new TestClass();
        Field field1=o1.getClass().getDeclaredField("ID");


        /*测试两种方法创建的field对象哈希码相同,可以得出同一字段的不同Field对象全都是引用同一个Field对象*/
        System.out.println("通过getDeclaredField获取的Field对象哈希值为:   "+field.hashCode());
        System.out.println("通过getDeclaredField获取的Field对象哈希值为:   "+field1.hashCode());
        System.out.println("由此可见,相同的Field对象只占用内存中一个地址,多个引用者共同引用");



        System.out.println("该属性对象是:   "+field.toString());
        field.setAccessible(true);//设定该字段名属性对应的Field对象取消检查,使其可以访问private内容
        field.set(o,1);
        System.out.println("该属性对象的字段名为:   "+field.getName());
        System.out.println("该类实例对象的该属性的值为:    "+field.get(o));
        System.out.println(o.toString());
        //field.setLong(0,333L); 与该Field对象的字段类型不匹配 无法执行
        field.setInt(o,3);
        System.out.println(o.toString());

    }
}
