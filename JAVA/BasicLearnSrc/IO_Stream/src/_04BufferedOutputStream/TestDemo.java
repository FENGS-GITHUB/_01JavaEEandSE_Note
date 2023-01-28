package _04BufferedOutputStream;

import java.io.*;

public class TestDemo {
    public static void main(String[] args) throws IOException {

        /*
        * BufferedInputStream是一个带缓冲区的输出流
        * 该流的数据流向:程序输出-->内存缓冲区-->硬盘
        * 方法与FileInputStream用法相同
        * */

        BufferedInputStream bufferedInputStream1 =
                new BufferedInputStream(
                        new FileInputStream("IO_Stream/TestFiles/_04BufferedOutputStreamTestFiles/test01.txt")
                );
        BufferedOutputStream bufferedOutputStream1 =
                new BufferedOutputStream(
                        new FileOutputStream("IO_Stream/TestFiles/_04BufferedOutputStreamTestFiles/test02.txt")
                );
        TestMethods.bufferedCopy(bufferedInputStream1,bufferedOutputStream1);





    }
}
