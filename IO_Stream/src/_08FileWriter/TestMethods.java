package _08FileWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestMethods {

    static void readerCopy(FileReader fileReader, FileWriter fileWriter) throws IOException {
        System.out.println("字符输出流开始输出");
        int counter=fileReader.read();
        System.out.println((char) counter);
        while (counter!=-1){
            fileWriter.write(counter);
            counter=fileReader.read();
        }
        System.out.println("复制成功");
    }
}
