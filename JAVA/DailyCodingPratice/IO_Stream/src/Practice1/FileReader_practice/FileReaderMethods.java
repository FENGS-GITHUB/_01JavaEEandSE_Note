package Practice1.FileReader_practice;

import java.beans.beancontext.BeanContextChild;
import java.io.FileReader;





public class FileReaderMethods {
    static void readBychar(FileReader fileReader) throws Exception {
        int readcount;
        char[] chars=new char[4];
        while((readcount=fileReader.read(chars))==4){
            for (char a:chars) {
                System.out.println(a);
            }
        }
        System.out.println(new String(chars,0,readcount));

        }





    static void readBychars(FileReader fileReader)throws Exception{
        char[] chars=new char[4];
        int readcount;
        while((readcount=fileReader.read(chars))==4){
            System.out.println(new String(chars,0,readcount));
        }
        System.out.println(new String(chars,0,readcount));

    }
}
