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
        /*
        * fileInputStream1 read()方法测试
        * 每read()一次,光标后移一位
        * 当光标处无字节时,返回值为-1
        * 当流使用完毕,执行close()关闭流
        * */
        FileInputStream fileInputStream1 = new FileInputStream("IO_Stream/TestFiles/_01FileInputStreamTestFiles/test01.txt");
        TestMethods.readTest(fileInputStream1);//read方法第一次测试;
        TestMethods.readTest(fileInputStream1);//read方法第二次测试;
        fileInputStream1.close();

        /*
        * fileInputStream2 光标测试
        * skip(),available()测试
        * available()查看光标之后剩余多少字节
        * skip(n) 光标后移n个字节
        *
        * */
        FileInputStream fileInputStream2 = new FileInputStream("IO_Stream/TestFiles/_01FileInputStreamTestFiles/test01.txt");
        TestMethods.skipTest(fileInputStream2);
        fileInputStream2.close();

        /*
        * fileInputStream3测试read(byte[] b)
        * 该方法是将字节数组b长度相同的字节读取并存入到字节数组b中
        * b就是一个字节数组缓冲区
        * 该方法返回值是存入缓冲区数组的个数,一般情况下存满,如果到末尾可能会存不满
        * read(byte[] b,int off,int len)
        * 返回值为存入缓冲区数组的字节个数
        * off:存储缓冲区的起始位置索引
        * len:存入个数
        * */

        FileInputStream fileInputStream3 =new FileInputStream("IO_Stream/TestFiles/_01FileInputStreamTestFiles/test01.txt");
        TestMethods.bytesRead(fileInputStream3);



    }
}
