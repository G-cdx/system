package main;

import java.beans.IntrospectionException;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        OutputStream out = new FileOutputStream(new File("D:/work/ser.txt"));
//        User user = new User();
//        user.setUsername("小明");
//        user.setAddress("北京");
//        user.setAge(18);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
//        objectOutputStream.writeObject(user);
//        objectOutputStream.close();
//        out.close();

        InputStream in = new FileInputStream(new File("D:/work/ser.txt"));
        ObjectInputStream oin = new ObjectInputStream(in);
        User user1 = (User)oin.readObject();
        System.out.println(user1);
    }
}
