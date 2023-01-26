package _01Class;

/*反射Reflect
    通过代码来实现操作字节码.class文件
    隶属于包java.lang.reflect.*

如何操作字节码文件：
    获取类的字节码对象,也就是Class类对象
        三种方法:
            1通过静态方法 Class.forName(全类名);来获取一个Class类对象;
            2通过对象获取 obj.getClass(); 通过对象调用getClass()方法来实现;
            3直接通过类名.class方法,返回一个Class类对象
                (这种方法原理是:所有类都一个class属性,调用该属性返回该类类对象)

Class对象:
    字节码文件装载到jvm中 只有一份
    也就是说所有字节码对象=Class对象 全部存储在方法区
    并且所有Class对象全部指向方法区同一地址 也就是方法区内字节码文件

Class类的对象方法:
    newInstance 创建对象
    底层是调用该Class对象的无参数构造方法
    如果该类有有参构造 使用该方法就会出异常*/


import java.io.File;
import java.lang.reflect.Field;

public class TestDemo {
    public static void main(String[] args) throws Exception{

        /*三种获取类对象地方法:*/
        Class C1=Class.forName("_01Class.TestClass");
        Class C2=(new TestClass(1,1388888,"ERIC")).getClass();
        Class C3= TestClass.class;

        /*测试生成地三个Class对象,全部是引用一个相同对象*/
        System.out.println(C1.hashCode());
        System.out.println(C2.hashCode());
        System.out.println(C3.hashCode());

        System.out.println(C1.getClassLoader().toString());

        /*包装类和基础类获得的Class对象不同
        * 包装类.TYPE属性才与基本数据类型.class相同
        * */
        boolean b1 = Integer.class == int.class;
        boolean b2 = Integer.TYPE == int.class;
        System.out.println(b1);
        System.out.println(b2);

        /*
        * 此处代码为测试Class对象获取信息的各种方法
        * */
        TestMethods.getInformations(C1);
        TestMethods.getInformations(A.class);
        TestMethods.getInformations(B.class);

        /*
        * 获取父类Class对象
        * 可以多层获取
        * */
        System.out.println("A的父类,爷爷类:");
        System.out.println((A.class).getSuperclass());
        System.out.println((A.class).getSuperclass().getSuperclass());
        System.out.println("B的父类,爷爷类,太爷爷类:");
        System.out.println((B.class).getSuperclass());
        System.out.println((B.class).getSuperclass().getSuperclass());
        System.out.println((B.class).getSuperclass().getSuperclass().getSuperclass());
        /*判断两个类是否存在继承或者实现关系*/
        System.out.println("L70=========实现/继承关系判断");
        System.out.println(A.class.isAssignableFrom(B.class));
        /*判断是否为接口*/
        System.out.println("L73-L74========接口判断========");
        System.out.println(A.class.isInterface());
        System.out.println(Appendable.class.isInterface());


        /*通过类对象来获取其他对象:Field对象,Method对象,Constructor对象 */
        TestMethods.getpublicFields(C1);

        TestMethods.getpublicMethods(C1);


    }
}

