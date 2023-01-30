package _01Class;

import java.io.Serializable;

public class TestClass implements Serializable {
    private int ID;
    private int tel;
    public int TEMP;

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

    private String name;
    public  TestClass(){
        System.out.println("调用无参构造");
    }
    public TestClass(int i,int j,String s){
        ID=i;
        tel=j;
        name=s;
    }

    public String toString(){

     return "TestClass{" +
             "ID="+ ID +
             ";NAME=" +name +
             ";tel="+tel;


    }


}

