package com.atey.design_mode.mode.create_mode.single_mode.break_single.method1;

//序列化和反序列化会破坏单例模式
import java.io.*;

public class Client {
    public static void main(String[] args) throws Exception{
        readObjectFromFile();
        readObjectFromFile();
    }

    //从文件中读取对象
    public static void readObjectFromFile() throws Exception{
        FileInputStream fis = new FileInputStream("C:\\develop\\temp\\single.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Single instance = (Single)ois.readObject();
        System.out.println(instance);
    }

    //将对象写入文件中
    public static void writeObject2File() throws Exception{
        Single instance  = Single.getInstance();
        FileOutputStream fos = new FileOutputStream("C:\\develop\\temp\\single.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(instance);
        oos.close();
    }
}
