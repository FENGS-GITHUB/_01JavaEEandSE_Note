package _09BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestMethods {
    static void readtest(BufferedReader bufferedReader) throws IOException {
        int read;
        read = bufferedReader.read();
        while (read!=-1){
            System.out.println((char) read);
            read=bufferedReader.read();
        }
}
}
