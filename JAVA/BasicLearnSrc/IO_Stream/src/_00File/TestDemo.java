package _00File;

import java.io.File;
import java.io.IOException;

public class TestDemo {
    public static void main(String[] args) throws Exception {
        /*
        * mkdir创建单层文件,若路径存在断点则无法创建文件夹
        * mkdirs创建多层文件,路径有断点创建整条路经
        * */

        System.out.println("=========全为false说明该路径无文件=====");
        File file=new File("IO_Stream\\TestFiles\\testdoc");
        TestMethods.Exist(file);
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        System.out.println("=========全为false说明文件夹创建失败=====");
        file=new File("IO_Stream\\TestFiles\\test0\\test00");
        file.mkdir();
        TestMethods.Exist(file);

        System.out.println("=========全为true说明文件夹创建成功=====");
        file.mkdirs();
        TestMethods.Exist(file);
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        System.out.println("=========测试创建文件=====");
        file=new File("IO_Stream\\TestFiles\\test0\\test01.txt");
        TestMethods.Create(file);
    }
}
