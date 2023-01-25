package _01FileInputStream;

import java.io.FileInputStream;

public class TestMethods {
    static void readTest(FileInputStream fileInputStream) throws Exception{
        /*read()方法,每读取一次,光标后移一位,返回值为int类型其字符的ASCII码
         *fileInputStream.read();
         * 如果没读取到文字,则返回值为-1
         * */
        int tempread ;
        int tempcount=0;
        char[] chars = new char[60];
        while((tempread=fileInputStream.read())!=-1){
            chars[tempcount]= (char)tempread;
            tempcount++;
        }
        System.out.println(chars);
    }



    static void skipTest(FileInputStream fileInputStream)throws Exception {
        int i = 1;
        System.out.println("当前有available()" + fileInputStream.available() + "字节");
        System.out.println("跳过skip()12个字节");
        fileInputStream.skip(12);
        System.out.println("剩余available()" + fileInputStream.available() + "字节");
        while (i < 5) {
            fileInputStream.read();
            i++;
        }
        System.out.println("读取了4个字节");
        System.out.println("剩余available()" + fileInputStream.available() + "字节");

    }


    static void bytesRead (FileInputStream fileInputStream ) throws Exception{
            /* read方法通过数组读取的原理:
             *通过流将内容读取到数组中存储
             *返回值int类型,读取进入到数组中的字节数
             *循环读取时,会覆盖数组原有元素
             *如果未完全覆盖数组,数组未覆盖的字节保留原样
             */
        byte[] bytes=new byte[4];
        int readcounter=0;

        while (true){
            readcounter=fileInputStream.read(bytes);
            if (readcounter!=4){
                for (int i=0;i<readcounter;i++) {
                    System.out.println((char)bytes[i]);
                }
                break;
                }
            System.out.println(new String(bytes));

        }

    }

    }

