package _13ObjectStream;

import java.io.*;

public class InputDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        * 反序列化
        * 通过版本号来确定反序列化的类是哪个类
        * 反序列化通过方法:readObject()来实现
        * */

        FileInputStream fileInputStream1=new FileInputStream("IO_Stream/TestFiles/_13ObjectStream/obj");
        ObjectInputStream objectInputStream1=new ObjectInputStream(fileInputStream1);
        Object o = objectInputStream1.readObject();
        Information information=(Information) o;
        System.out.println(information.NUM);
        System.out.println(information.getName());

    }
}
