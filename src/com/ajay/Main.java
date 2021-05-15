package com.ajay;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        String[] names = {"Ajay", "Sam", "Nandini"};
//        Arrays.stream(names).forEach(System.out::println);

        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = sc.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You are born in "+year);

    }
}
