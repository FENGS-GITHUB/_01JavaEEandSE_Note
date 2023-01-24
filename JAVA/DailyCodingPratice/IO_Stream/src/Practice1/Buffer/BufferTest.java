package Practice1.Buffer;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferTest {
    public static void main(String[] args) throws Exception{
        /*节点流:真正所需要的流,在此程序中就是fileReader,一条基本管道
        *包装流:在节点流的基础上进行包装的流,在基本管道上进行包装的流
        * 对于包装流来说,最外层流(包装流)关闭后会自动关闭节点流
        * */
        FileReader fileReader=new FileReader("IO_Stream\\A.txt");
        BufferedReader buffer =new BufferedReader(fileReader);
        String s;
        while(true) {
            s = buffer.readLine();
            if (s == null) {
              break;
            }else{
                System.out.println(s);
            };
        };

    }
}
