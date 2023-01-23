package Practice1.Copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteCopy {
    static void bytecopy(FileInputStream fis, FileOutputStream fos) throws Exception{
        int read;
        while ((read= fis.read())!=-1){
            fos.write(read);
        }
        fis.close();
        fos.close();
    }
}
