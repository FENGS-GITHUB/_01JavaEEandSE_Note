package _13ObjectStream;

import java.io.Serializable;

public class Information implements Serializable {
    //可序列化的类Information


    private final static long serialVersionUID=1L;//序列化版本号,手动设定可以防止改动
    public transient int NUM;//triasnt设定该成员不参与序列化
    private int ID;
    private int tel;
    private String name;

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




}
