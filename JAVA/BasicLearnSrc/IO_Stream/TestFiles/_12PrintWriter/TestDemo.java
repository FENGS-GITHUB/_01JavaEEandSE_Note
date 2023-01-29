package _12PrintWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TestDemo {
    /*与PrintStream相同,都是一种高级输出流
    * 但是PrintWrtier只能够输出文本文件,无法写入非文本文件
    * 可作为节点流和包装流
    * */

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter printWriter1 =new PrintWriter("IO_Stream/TestFiles/_12PrintWriterTestFiles/test01.txt","UTF-16");
        printWriter1.println("测试写入进入文本中");
        printWriter1.flush();

    }
}
