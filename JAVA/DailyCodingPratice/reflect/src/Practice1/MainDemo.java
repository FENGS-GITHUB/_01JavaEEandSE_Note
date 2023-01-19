package Practice1;

import java.lang.reflect.Constructor;

public class MainDemo {
    public static void main(String[] args) throws Exception {

        /*获取类对象 testclass*/
        Class testclass=Class.forName("Practice1.Testclass1");
        System.out.println(testclass);
        Class testclass1=Testclass1.class;
        System.out.println(testclass);

        /*获取构造函数*/
        Constructor A = testclass1.getDeclaredConstructor(int.class);
        System.out.println(A);
        /*构造函数对象 创建一个对象*/
        Object o = A.newInstance(1);
        Testclass1 t1=(Testclass1)o;
        System.out.println(t1.testfield1);

        /*通过new 建立一个实例对象并使用*/
        Testclass1 t2=new Testclass1(1);
        System.out.println(t2.testfield1);
    }

}
