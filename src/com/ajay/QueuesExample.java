package com.ajay;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuesExample {
    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();

        queue.add("America");
        queue.add("Russia");
        queue.add("France");
        queue.add("India");

        for(String q : queue){
            System.out.println(q);
        }

        queue.remove();


        String head = queue.peek();
        System.out.println(head);

        head = queue.poll();
        System.out.println(head);

        for(String q : queue){
            System.out.println(q);
        }

    }
}
