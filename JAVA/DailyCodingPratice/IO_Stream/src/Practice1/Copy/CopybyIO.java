package Practice1.Copy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class CopybyIO {
    public static void main(String[] args) throws Exception{
        File A=new File("IO_Stream\\A.txt");
        File B=new File("IO_Stream\\B.txt");
        FileInputStream fis=new FileInputStream(A);
        FileOutputStream fos=new FileOutputStream(B);
        //ByteCopy.bytecopy(fis,fos);
        BytesCopy.bytesCopy(fis,fos);

    }
}
