package _05InputStreamReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class TestDemo {
    public static void main(String[] args) throws Exception {
        /*inputStreamReader1测试:
        * 读取编码设定为UTF-8,可以正常读取
        * */
        InputStreamReader inputStreamReader1 =
               new InputStreamReader(
                       new FileInputStream("IO_Stream/TestFiles/_05InputStreamReaderTestFiles/test01.txt"), "UTF-8");

        TestMethods.read(inputStreamReader1);

        /*inputStreamReader2测试:
         * 读取编码设定为GB2312,读取为乱码
         * */
        InputStreamReader inputStreamReader2 =
                new InputStreamReader(
                        new FileInputStream("IO_Stream/TestFiles/_05InputStreamReaderTestFiles/test01.txt"), "GB2312");

        TestMethods.read(inputStreamReader2);

        inputStreamReader1.close();
        inputStreamReader2.close();
    }

}
