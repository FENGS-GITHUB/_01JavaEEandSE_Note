package Practice1.Copy;

import Practice1.FileInputStream_practice.TestSteamMethods;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BytesCopy {
    static void bytesCopy(FileInputStream fis, FileOutputStream fos)throws Exception{
        int readcount;
        byte[] bytes=new byte[2];
        System.out.println("被复制的文件字节"+fis.available());
        while ((readcount=fis.read(bytes))==2){
            fos.write(bytes);
        }
        fos.write(bytes,0,readcount);

    }
}
