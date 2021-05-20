package com.ajay;

import java.util.*;

public class CollectionsExample {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(5);
        LinkedList<String> linkedList = new LinkedList<>();
        Set<String> hashSet = new HashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        //HashSet Examples
        boolean r1 = hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        boolean r2 = hashSet.add("A");

        System.out.println(hashSet);
        System.out.println("r1="+r1 + " r2=" + r2);
        System.out.println("Hash Set Contains C or not? "+hashSet.contains("C"));
        hashSet.remove("C");
        for(String item : hashSet)
            System.out.println(item);

        //TreeSet Examples  (Not thread safe)
        boolean t1 = treeSet.add("C");
        treeSet.add("B");
        treeSet.add("A");
        boolean t2 = treeSet.add("A");
        System.out.println(treeSet);
        System.out.println("t1="+t1 + " t2=" + t2);
        System.out.println("Tree Set Contains C or not? "+ treeSet.contains("C"));
        treeSet.remove("C");
        for(String item : treeSet)
            System.out.println(item);

        // ArrayList Examples
        for(int i=1; i<=5; i++){
            arrayList.add(i);
        }

        System.out.println(arrayList);
        arrayList.remove(3);
        System.out.println(arrayList);

        for(int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        //LinkedList Examples
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("B");
        linkedList.addLast("C");
        linkedList.addFirst("D");
        linkedList.add(2,"E");

        System.out.println(linkedList);

        linkedList.remove("B");
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.remove(1);
        System.out.println(linkedList);
    }
}
