package com.ajay;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIOExample {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("D:\\Java\\IdeaProjects\\learning-java\\sample.txt");
        FileIOExample ex = new FileIOExample();
        ex.fileWriter(f);
        ex.fileReader(f);
    }

    private void fileReader(File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }

    private void fileWriter(File file) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(file);
            pw.println("Ajay has created this file via Java code");
            pw.println("1004");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        } finally {
            pw.close();
        }
    }

}
