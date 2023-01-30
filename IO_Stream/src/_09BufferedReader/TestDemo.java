package _09BufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader1=new FileReader("IO_Stream/TestFiles/_09BufferedReaderTestFiles/test01.txt");
        BufferedReader bufferedReader1=new BufferedReader(fileReader1);
        TestMethods.readtest(bufferedReader1);
        bufferedReader1.close();
    }
}
