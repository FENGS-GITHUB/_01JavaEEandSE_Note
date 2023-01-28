package _03BufferedInputStream;

import java.io.BufferedInputStream;
import java.io.IOException;

public class TestMethods {
    static void markTest(BufferedInputStream bufferedInputStream)throws Exception{

        System.out.println("测试:mark方法");
        bufferedInputStream.mark(20);
        System.out.println("在此处执行mark方法,剩余字节数:"+ bufferedInputStream.available());
        bufferedInputStream.skip(5);
        System.out.println("光标后移五个字节,剩余字节数:"+ bufferedInputStream.available());
        bufferedInputStream.reset();
        System.out.println("在此处执行reset方法,剩余字节数"+bufferedInputStream.available());
}





}
