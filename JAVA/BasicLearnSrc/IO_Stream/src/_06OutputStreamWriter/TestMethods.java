package _06OutputStreamWriter;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestMethods {
    static void copytest(InputStreamReader inputStreamReader,
                         OutputStreamWriter outputStreamWriter) throws IOException {
        System.out.println("开始复制");
        int counter=inputStreamReader.read();
        while(counter!=-1) {
            outputStreamWriter.write(counter);
            counter = inputStreamReader.read();


        }
        System.out.println("复制成功");

    }
}
