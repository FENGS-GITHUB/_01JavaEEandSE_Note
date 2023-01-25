package _01FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

/*
* 文件字节输入流,从硬盘读取所有类型数据的流
* 包括文本,媒体等任何文件
* 其功能是根据指定路径搭建一个节点流,形成一个管道
* 通过管道实现硬盘文件加载入内存中
*
* 这种管道是一种带"指向硬盘文件内容的光标"的管道
* 当刚刚搭建好流时,光标定位在文件的第一个字节
* 执行read()等方法时,光标自动移动到下一个字节
* 执行skip(long num)方法时,光标会后跳num个字节
*
* 构造方法:
* FileInputStream(File file) 以file路径对象作为节点,搭建管道
* FileInputStream(String path) 以字符串内容为路径节点,搭建管道
* */

/*
* 测试代码内容:
* read();单个读取
* read(byte[] bytes);字节数组读取
* skip(int n)光标后跳n个字节
* available()查看剩余多少字节
* */

public class TestDemo {
    public static void main(String[] args) throws Exception{
        System.out.println("====================read方法测试fileInputStream1======");
        FileInputStream fileInputStream1= new FileInputStream("IO_Stream\\TestFiles\\test1.txt");
        TestMethods.readTest(fileInputStream1);//read方法第一次测试;
        TestMethods.readTest(fileInputStream1);//read方法第二次测试;
        fileInputStream1.close();
        /*
        * 光标是随流同时存在的,创建一个流,通过read()方法使光标移动
        * 使用其他方法,光标位置不会从头开始,
        * 即使read()到了最后的文件
        * 要想光标重新开始,就需要重新开启一个流
        * */


        System.out.println("====================字节数组读取测试fileInputStream2======");
        FileInputStream fileInputStream2= new FileInputStream("IO_Stream\\TestFiles\\test1.txt");
        TestMethods.bytesRead(fileInputStream2);
        fileInputStream2.close();
        /*
         * 该处实验代码验证了"光标和流同时存在,两者声明周期相同"
         * */
        System.out.println("====================skip()等其他方法测试fileInputStream3======");
        FileInputStream fileInputStream3= new FileInputStream("IO_Stream\\TestFiles\\test1.txt");
        TestMethods.skipTest(fileInputStream3);
        fileInputStream3.close();




    }
}
