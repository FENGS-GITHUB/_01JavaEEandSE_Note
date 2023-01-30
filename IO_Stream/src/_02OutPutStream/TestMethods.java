package _02OutPutStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class TestMethods {

    static void close(FileInputStream fileInputStream,FileOutputStream fileOutputStream) throws Exception {
        fileInputStream.close();
        fileOutputStream.close();
    }

    static void writeFromFileInputStream1(FileInputStream fileInputStream,FileOutputStream fileOutputStream) throws Exception {
        System.out.println("==============单个字节写入测试===========");
        int statecount;
        while(true){
            statecount= fileInputStream.read();
            if (statecount==-1){
                break;
            }else{
                fileOutputStream.write(statecount);
            }
        }
        System.out.println("单字节写入写出完成");
    }

    static void writeBytes(FileInputStream fileInputStream,FileOutputStream fileOutputStream) throws Exception{
        int statecount=0;
        byte[] buf=new byte[5];
        System.out.println("===========开始使用缓冲区读取和写入实现复制========");
        while((statecount=fileInputStream.read(buf))==5){
            fileOutputStream.write(buf);
        }
        fileOutputStream.write(buf,0,statecount);
        System.out.println("复制完成");

    }
}

