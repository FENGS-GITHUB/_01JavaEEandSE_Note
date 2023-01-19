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
    }

}
