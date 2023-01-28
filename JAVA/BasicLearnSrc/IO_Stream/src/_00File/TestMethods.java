package _00File;

import java.io.File;
import java.io.IOException;

public class TestMethods {
    static void Exist(File file){
        System.out.println("=========文件验证测试=========");
        System.out.println("当前路径或文件在硬盘是否存在"+ file.exists());
        System.out.println("当前路径指向是否为文件夹:"+ file.isDirectory());
        System.out.println("当前路径指向是否为文件:"+ file.isFile());
        System.out.println("当前路径是否可以执行文件:"+ file.canExecute());
        System.out.println("当前路径是否可以写入文件:"+ file.canWrite());
        System.out.println("当前路径是否可以读取文件:"+ file.canRead());

    }

    static void Create(File file){
        System.out.println("=========文件创建测试=========");
        System.out.println("创建路径及文件为:"+file.toString());
        try{
            if(file.createNewFile()){
                System.out.println("创建成功");

            }else{
                System.out.println("已有该文件,创建失败");
            }

        }catch (IOException e){
            System.out.println("系统找不到该路径,无法创建");
        }

    }

    static void dirCreate1(File file){
        System.out.println("=========单层文件夹创建测试=========");
        if(file.mkdir()==true){
            System.out.println("单层成功创建");
        }else{
            System.out.println("单层创建失败");
        }
    }

    static void dirCreate2(File file){
        System.out.println("=========多层文件夹创建测试=========");
        if(file.mkdirs()==true){
            System.out.println("多层成功创建");
        }else{
            System.out.println("多层创建失败");
        }
    }



}
