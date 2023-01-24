package Practice1.FileWrtier_practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_WriteDemo  {
    /*
    * FileReader和FileWriter只能够读取和写入文本文件
    * 字节输入输出流可以写入写出任何文件
    * */
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("IO_Stream\\C.txt");
        fileWriter.write("测试向文件覆盖写入内容");
        fileWriter.flush();
    }


}
