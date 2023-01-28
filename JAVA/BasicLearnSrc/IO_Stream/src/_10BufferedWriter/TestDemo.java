package _10BufferedWriter;

import java.io.*;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader1=new FileReader("IO_Stream/TestFiles/_10BufferedWriterTestFiles/test01.txt");
        BufferedReader bufferedReader1=new BufferedReader(fileReader1);
        FileWriter fileWriter1 =new FileWriter("IO_Stream/TestFiles/_10BufferedWriterTestFiles/test02.txt");
        BufferedWriter bufferedWriter1 = new BufferedWriter(fileWriter1);
        TestMethods.bufferedCopy(bufferedReader1,bufferedWriter1);
        bufferedReader1.close();
        bufferedWriter1.close();

    }
}
