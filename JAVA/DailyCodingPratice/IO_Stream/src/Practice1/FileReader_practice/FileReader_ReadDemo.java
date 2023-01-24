package Practice1.FileReader_practice;

import java.io.FileReader;
import java.nio.charset.StandardCharsets;

public class FileReader_ReadDemo {
    public static void main(String[] args) throws Exception {
        FileReader fileReader=new FileReader("IO_Stream\\C.txt");
        //FileReaderMethods.readBychars(fileReader);
        //FileReaderMethods.readBychar(fileReader);
    }
}
