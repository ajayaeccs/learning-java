package com.ajay;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileIOStreamExample {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\Java\\IdeaProjects\\learning-java\\sample.txt");
        FileIOStreamExample ex = new FileIOStreamExample();
        ex.fileWriter(f);
        ex.fileReader(f);
    }

    private void fileReader(File file) throws IOException {
        FileInputStream sc = new FileInputStream(file);
        int readInteger = 0;
        while((readInteger=sc.read())!=-1){
            System.out.print((char) readInteger);
        }
        sc.close();
    }

    private void fileWriter(File file) throws IOException {
       FileOutputStream pw = new FileOutputStream(file);
       pw.write("Ajay has written byte stream via java code".getBytes());
       pw.close();
    }

}
