package com.ajay;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstSample {

    public static void main(String[] args) {
        // write your code here
        String[] names = {"Ajay", "Sam", "Nandini"};
        Arrays.stream(names).forEach(System.out::println);

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Ajay");
        sb.append("Srivastava");
        System.out.println(sb);
        System.out.println("How old are you? ");
        int age = sc.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You are born in " + year);
    }
}
