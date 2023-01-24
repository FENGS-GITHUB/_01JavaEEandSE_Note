package Practice1.PrintStream;

import java.awt.*;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;

public class PrintStreamdemo {
    public static void main(String[] args) throws Exception{
        PrintStream printStream=new PrintStream(new FileOutputStream("IO_Stream\\D.txt"));
        System.setOut(printStream);
        System.out.println("aaaaaaaaaaaa");

    }
}
