package _02OutPutStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestDemo {
    public static void main(String[] args) throws Exception {
        /*
        * fileOutputStream1测试:
        * 通过write方法向输出流目标文件写入
        * write(n) 将字节n写入到文件中
        * */
        FileOutputStream fileOutputStream1 =new FileOutputStream("IO_Stream/TestFiles/_02FileOutputStreamTestFiles/test02.txt");
        FileInputStream fileInputStream1 =new FileInputStream("IO_Stream/TestFiles/_02FileOutputStreamTestFiles/test01.txt");
        TestMethods.writeFromFileInputStream1(fileInputStream1,fileOutputStream1);
        TestMethods.close(fileInputStream1,fileOutputStream1);

        /*
         * fileOutputStream2测试:
         * 构造方法参数列表如果append为true,
         * 写入是将文件从文件末尾追加写入
         * */
        System.out.println("追加写入测试");
        FileInputStream fileInputStream2 =new FileInputStream("IO_Stream/TestFiles/_02FileOutputStreamTestFiles/test01.txt");
        FileOutputStream fileOutputStream2 =new FileOutputStream("IO_Stream/TestFiles/_02FileOutputStreamTestFiles/test02.txt",true);
        TestMethods.writeFromFileInputStream1(fileInputStream2,fileOutputStream2);
        TestMethods.close(fileInputStream2,fileOutputStream2);

        /*
        * fileInputStream3测试:通过write方法,将参数字节数组写入至目标位置
        * write(byte[] b) 将字节数组b的所有非空元素写入到目标位置
        * write(byte[] b, int off, int len)  从字节数组b的off出索引写入,写入len个字节
        * */

        FileInputStream fileInputStream3 =new FileInputStream("IO_Stream/TestFiles/_02FileOutputStreamTestFiles/test01.txt");
        FileOutputStream fileOutputStream3 =new FileOutputStream("IO_Stream/TestFiles/_02FileOutputStreamTestFiles/test02.txt",false);
        TestMethods.writeBytes(fileInputStream3,fileOutputStream3);
        TestMethods.close(fileInputStream3,fileOutputStream3);

    }

}
