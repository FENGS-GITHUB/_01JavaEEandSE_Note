package Practice1.FileInputStream_practice;

import java.io.FileInputStream;
import java.io.IOException;

public class TestSteamMethods {
    /*read()方法
     * 每次读取一个字节,并且光标移动到下一个字节
     * 光标:一个指向文件字符的指针
     * 返回值:该光标处的字符的ASCII码,并且将光标后移一位
     * 当光标指向空字符时,返回值为-1
     * */
    static void StreamShow(FileInputStream fileInputStream) throws Exception{

        int read;
        while((read=fileInputStream.read())!=-1){
            System.out.println(read);
        }
        fileInputStream.close();
    }

    /*read(byte[] bytes)方法
     * 以bytes[]方式进行读取,数据存入参数数组中,返回值为数组内元素改变个数
     * 每次传入到数组中
     * 下次读取覆盖原有数组,填不满的不覆盖
     * 例如: 填入前数组bytes:[1,2,3,4] 填入[3,3] 结果为[3,3,3,4]
     * */

    static void StreamByteshow(FileInputStream fileInputStream)throws Exception{

        int readcount;
        byte[] bytes=new byte[2];

        while ((readcount=fileInputStream.read(bytes))==2){
        System.out.println(new String(bytes,0,readcount));
            System.out.println(readcount);
            TestSteamMethods.available_test(fileInputStream);
        }
        System.out.println(new String(bytes,0,readcount));
        System.out.println(readcount);


    }

/*available()方法
*返回值为光标所在处往后有多少个字节
* */
    static void available_test(FileInputStream fileInputStream) throws Exception {
        int A1=fileInputStream.available();
        System.out.println("剩余字数"+A1);
    }
/*
* skip()方法
* 让光标向后跳跃几个字节
* */
    static  void skip_test(FileInputStream fileInputStream) throws Exception{
        fileInputStream.skip(5);
        System.out.println(fileInputStream.available());
        fileInputStream.skip(5);
        System.out.println(fileInputStream.available());



    }

}

