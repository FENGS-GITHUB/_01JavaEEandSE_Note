package _03BufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class TestDemo {
    public static void main(String[] args) throws Exception{

        /*
        * bufferedInputStream1 测试:mark方法
        * mark()方法:在当前光标处做一个标记,参数为之后光标移动多少字节标记失效
        * reset()方法:将光标移动至定义好的标记处
        * */

        InputStream inputStream1=new FileInputStream("IO_Stream/TestFiles/_03BufferedInputStreamTestFiles/test01.txt");
        BufferedInputStream bufferedInputStream1 =new BufferedInputStream(inputStream1);
        TestMethods.markTest(bufferedInputStream1);
        bufferedInputStream1.close();

        /*
        * BufferedInputStream的实例对象读取方式
        * 和FileInputStream的实例对象读取方法调用与执行相同
        *
        * 只不过FileInputStream是从硬盘读取
        * BufferedInputStream是从内存的缓冲区中读取
        * 因此BufferedInputStream效率更高
        *
        * read方法略
        * */




    }
}
