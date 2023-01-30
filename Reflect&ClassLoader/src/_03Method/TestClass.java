package _03Method;

import java.io.Serializable;

public class TestClass implements Serializable {
    static {
        System.out.println("TestClass类已加载");
    }
    private int ID;
    private int tel;
    public long TEMP;
    private String name;

    public TestClass(){
        System.out.println("调用无参构造创建对象");
    }
    public TestClass(int i, int j, String s){
        ID=i;
        tel=j;
        name=s;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void privateTestMethod1(int i,int j){
        System.out.println("这是一个有两个int参数的私有方法");
    }




    public String toString(){

     return "TestClass{" +
             "ID="+ ID +
             ";NAME=" +name +
             ";tel="+tel+"}";


    }


}

