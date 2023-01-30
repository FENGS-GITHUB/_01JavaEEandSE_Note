package _13ObjectStream;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.zip.Inflater;
/*
 * 序列化一个对象,保存至硬盘指定位置
 * 序列化就是将对象存储在硬盘上保存
 * 被序列化的对象的类必须实现Serializable接口,声明该类可以被序列化
 * 每一个被序列化的类都有一个版本号serialVersionUID
 * 如果有不想被序列化的成员,可在对该成员进行triasnt修饰
 * 序列化后的反序列化是通过序列号来识别的,否则无法反序列化

 * */
public class OutputDemo {
    public static void main(String[] args)throws Exception {

        /*
        * objectOutputStream1 对象序列化流,包装流
        * 通过writeObject方法来将对象写入硬盘
        * */
        FileOutputStream fileOutputStream1=new FileOutputStream("IO_Stream/TestFiles/_13ObjectStream/obj");
        ObjectOutputStream objectOutputStream1 =new ObjectOutputStream(fileOutputStream1);
        Information information1 =new Information();
        objectOutputStream1.writeObject(information1);
        /*
        *
        * 将内存中的对象写入到硬盘中
        * 多个对象可以通过ArrayList存储到硬盘上
        *
        * */
        ArrayList<Information> list=new ArrayList<>();
        Information information2 =new Information();
        Information information3 =new Information();
        Information information4 =new Information();
        list.add(information1);
        list.add(information2);
        list.add(information3);
        list.add(information4);
        FileOutputStream fileOutputStream2=new FileOutputStream("IO_Stream/TestFiles/_13ObjectStream/obj1");
        ObjectOutputStream objectOutputStream2=new ObjectOutputStream(fileOutputStream1);
        objectOutputStream2.writeObject(list);


    }

}

