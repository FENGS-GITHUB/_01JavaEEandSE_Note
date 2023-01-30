package _07FileReader;

import com.sun.source.tree.WhileLoopTree;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class TestMethods {
    static void readtest(FileReader fileReader) throws IOException {
        int read;
        read = fileReader.read();
        while (read!=-1){
            System.out.println((char) read);
            read=fileReader.read();
        }



    }
}
