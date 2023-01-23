package Practice1.FileInputStream_practice;

import java.io.*;

public class IOtest {
    public static void main(String[] args) throws Exception  {
        File A=new File("IO_Stream\\A.txt");
        File B=new File("IO_Stream\\B.txt");
        FileInputStream fileInputStream1=new FileInputStream(A);
        FileOutputStream fileOutputStream1=new FileOutputStream(B);

        //available()方法:获取未读取的字节数量


//      单个读取
//      TestSteamMethods.StreamShow(fileInputStream1);
//      数组方式读取
//        TestSteamMethods.StreamByteshow(fileInputStream1);
//
//
        TestSteamMethods.skip_test(fileInputStream1);
    }
}

