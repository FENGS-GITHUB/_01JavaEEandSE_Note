package Practice1.FileOutputStream_practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOtest {
    public static void main(String[] args) throws Exception{
        File A=new File("IO_Stream\\A.txt");
        File B=new File("IO_Stream\\B.txt");
        FileOutputStream fileOutputStream=new FileOutputStream(B);
        FileOutputStreamMethods.write_test(fileOutputStream);

    }

}
