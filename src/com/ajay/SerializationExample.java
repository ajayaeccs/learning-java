package com.ajay;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File f = new File("D:\\Java\\IdeaProjects\\learning-java\\serialize.bin");
        SerializationExample ex = new SerializationExample();
        Employee employee = new Employee(6, "Ajay");
        ex.serialize(f,employee);
        ex.deserialize(f);
    }

    private void deserialize(File file) throws IOException, ClassNotFoundException {
        FileInputStream sc = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(sc);
        Employee e = (Employee) ois.readObject();
        System.out.println(e);
        ois.close();
    }

    private void serialize(File file, Employee e) throws IOException {
       FileOutputStream pw = new FileOutputStream(file);
       ObjectOutputStream oos = new ObjectOutputStream(pw);
       oos.writeObject(e);
       oos.close();
    }

}
