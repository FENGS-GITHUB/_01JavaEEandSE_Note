package Practice1.FileOutputStream_practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
* write()方法:
* 将内存条中数据写入到目标位置上
*
* */
public class FileOutputStreamMethods {
    static void write_test(FileOutputStream fileOutputStream) throws Exception {
        String testString="你好DDDDD";
        byte[] bytes=testString.getBytes(StandardCharsets.UTF_8);
        fileOutputStream.write(bytes);
        fileOutputStream.flush();
    }
}
