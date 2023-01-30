package _07FileReader;
/*
* FileReader只能够读取纯文本文件
* 是InputStreamReader的子类
* 继承了其read,mark等方法
*
* */

import java.io.FileReader;

public class TestDemo {
    public static void main(String[] args) throws Exception{
        FileReader fileReader=new FileReader("IO_Stream/TestFiles/_07FileReaderTestFiles/test01.txt");
        System.out.println("该文档的charset为:"+fileReader.getEncoding());
        System.out.println((char)fileReader.read());
        TestMethods.readtest(fileReader);
    }
}
