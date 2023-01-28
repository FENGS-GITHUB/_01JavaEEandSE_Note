package _00File;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TestDemo {
    public static void main(String[] args) throws Exception {
        /*
        * file1测试:
        * exists()查看路径是否存在
        * isDirectory()判断是否为文件夹
        * isFile() 判断是否为文件
        * .....
        *
        * */


        File file1=new File("IO_Stream/TestFiles/_00FileTestFiles/_00Filetest1.txt");
        TestMethods.Exist(file1);

       /* file2文件创建测试
        * createNewFile()创建文件,无法覆盖创建返回值为创建是否成功
        * */
        File file2=new File("IO_Stream/TestFiles/_00FileTestFiles/_00Filetest2.txt");
        TestMethods.Create(file2);

        /* file3 file4文件夹创建测试
         * mkdir()创建单层文件夹,若路径存在断点则无法创建文件夹
         * mkdirs()创建多层文件夹,路径有断点创建整条路经
         * PS:当该路径下有该文件夹存在,无法覆盖创建
         * */
        File file3=new File("IO_Stream/TestFiles/_00FileTestFiles/_00Filetest3/testdir1");
        File file4=new File("IO_Stream/TestFiles/_00FileTestFiles/_00Filetest3/testdir2");
        TestMethods.dirCreate1(file3);
        TestMethods.dirCreate2(file3);
        TestMethods.dirCreate1(file4);

        System.out.println("================文件删除测试=========");
        File file5=new File("IO_Stream/TestFiles/_00FileTestFiles/_00Filetest3");
        System.out.println(file5.delete());//目录不为空,无法删除
        System.out.println(file4.delete());//目录不为空,可删除


    }
}
