package com.ajay;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExamples {

    public static void main(String[] args) {

        List<Integer> nList = new ArrayList<>();
        Set<String> strSet = new HashSet<>();

        for(int i=1; i<=10; i++){
            nList.add(i);
        }

        List<Integer> squareList = nList.stream().map(x->x*x).collect(Collectors.toList());
        squareList.stream().forEach(x -> {System.out.print(x);
            System.out.print("\t");});

        strSet.add("Ajay");
        strSet.add("Akash");
        strSet.add("Nandini");
        strSet.add("Samriddhi");

        System.out.println();

        Set<String> filterSet = strSet.stream().filter(x->x.startsWith("A")).collect(Collectors.toSet());
        filterSet.stream().forEach(x-> {System.out.print(x);
            System.out.print("\t");});

        System.out.println();

        System.out.println(nList.stream().reduce(0,(ans,i)->ans+i));
    }
}
