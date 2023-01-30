package _10BufferedWriter;

import java.io.*;

public class TestMethods {

    static void bufferedCopy(BufferedReader bufferedReader, BufferedWriter bufferedWriter) throws IOException {
        System.out.println("字符输出流开始输出");
        int counter=bufferedReader.read();
        System.out.println((char) counter);
        while (counter!=-1){
            bufferedWriter.write(counter);
            counter=bufferedReader.read();
        }
        System.out.println("复制成功");
    }
}
