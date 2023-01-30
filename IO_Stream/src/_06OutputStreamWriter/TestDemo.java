package _06OutputStreamWriter;

import java.io.*;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        /*
        * 字节流包装成字符流
        * */

        OutputStreamWriter outputStreamWriter1=
                new OutputStreamWriter(
                        new FileOutputStream("IO_Stream/TestFiles/_06OutputStreamWriterTestFiles/test02.txt"));
        InputStreamReader inputStreamReader1 =
                new InputStreamReader(
                        new FileInputStream("IO_Stream/TestFiles/_06OutputStreamWriterTestFiles/test01.txt"));


        TestMethods.copytest(inputStreamReader1,outputStreamWriter1);
        outputStreamWriter1.close();
        inputStreamReader1.close();


        /*
        * 字符转码错误
        * 因此复制后的文件会出现乱码
        * */
        OutputStreamWriter outputStreamWriter2=
                new OutputStreamWriter(
                        new FileOutputStream("IO_Stream/TestFiles/_06OutputStreamWriterTestFiles/test04.txt"),"UTF-8");
        InputStreamReader inputStreamReader2 =
                new InputStreamReader(
                        new FileInputStream("IO_Stream/TestFiles/_06OutputStreamWriterTestFiles/test03.txt"),"gb2312");

        TestMethods.copytest(inputStreamReader2,outputStreamWriter2);
        outputStreamWriter2.close();
        inputStreamReader2.close();
    }
}
