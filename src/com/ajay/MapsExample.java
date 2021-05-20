package com.ajay;

import javax.lang.model.element.NestingKind;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapsExample {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        Hashtable<Integer, String> hashTable = new Hashtable<>();

        //HashTable Example


        //TreeMap Example
        treeMap.put(1,"c");
        treeMap.put(4,"a");
        treeMap.put(5,"b");
        treeMap.put(3,"a");
        System.out.println(treeMap);

        //HashMap Example
        hashMap.put("a",10);
        hashMap.put("b",20);
        hashMap.put("c",30);
        hashMap.put("c",30);

        System.out.println("Size="+hashMap.size());
        System.out.println(hashMap);

        if(hashMap.containsKey("a")){
            System.out.println("Key:\"a\" " + "Value:"+hashMap.get("a"));
        }

        for(String key : hashMap.keySet()){
            System.out.println("Key:\""+ key +"\" " + "Value:"+hashMap.get(key));
        }

        System.out.println("========================================");

        for(Map.Entry<String, Integer> e: hashMap.entrySet()){
            System.out.println("Key:\""+ e.getKey() +"\" " + "Value:"+ e.getValue());
        }

    }
}
