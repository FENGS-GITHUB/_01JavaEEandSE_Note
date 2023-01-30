package _11PrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class TestDemo {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        * 直接打印输出指定位置,通过println()和print()方法实现
        * println()与print()区别是结尾是否带换行符
        * 可以作为输出流的包装流,也可以直接作为节点流
        * 如果想追加写入,将被包装的节点流设定为可追加的stream即可
        * */
        PrintStream printStream1=new PrintStream("IO_Stream/TestFiles/_11PrintStreamTestFiles/test01.txt");
        printStream1.println("写入文件测试1,带换行丨");
        printStream1.print("写入文件测试2,无换行丨");
        printStream1.close();

        /*
        * 追加写入测试
        * */

        FileOutputStream fileOutputStream2=new FileOutputStream("IO_Stream/TestFiles/_11PrintStreamTestFiles/test01.txt",true);
        PrintStream printStream2=new PrintStream(fileOutputStream2);
        printStream2.println("写入文件测试3,带换行丨");
        printStream2.println("写入文件测试4,带换行丨");

        printStream2.close();
    }
}
