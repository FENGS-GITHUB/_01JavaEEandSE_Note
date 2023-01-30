package _08FileWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("IO_Stream/TestFiles/_08FileWriterTestFiles/test02.txt");
        FileReader fileReader=new FileReader("IO_Stream/TestFiles/_08FileWriterTestFiles/test01.txt");
        TestMethods.readerCopy(fileReader,fileWriter);
        fileReader.close();
        fileWriter.close();
    }

}
