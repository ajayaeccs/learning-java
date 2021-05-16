package com.ajay;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GenericsExample {

    public static void main(String[] args) {
        Integer[] arr = {2,3,4,5,10,15};
        String[] a = {"Ajay", "Nandini", "Sam", "Akash"};
        System.out.println(max(arr));
        System.out.println(max(a));
    }

    public static <T extends Comparable<T>> T max(T[] array){
        T m = array[0];
        for(int i=1; i<array.length; i++){
            if(m.compareTo(array[i]) < 0){
                m=array[i];
            }
        }
        return m;
    }
}
