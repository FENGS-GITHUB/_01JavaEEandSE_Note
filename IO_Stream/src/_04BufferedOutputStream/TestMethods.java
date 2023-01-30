package _04BufferedOutputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class TestMethods {
    static void bufferedCopy(BufferedInputStream bufferedInputStream,
                             BufferedOutputStream bufferedOutputStream) throws IOException {
        int read;
        while(true){

            read=bufferedInputStream.read();
            if (read==-1){
                break;
            }else {
                bufferedOutputStream.write(read);
            }
        }
        bufferedInputStream.close();
        bufferedOutputStream.flush();
        System.out.println("复制成功");
    }
}
