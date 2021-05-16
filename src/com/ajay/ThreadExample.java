package com.ajay;

public class ThreadExample extends Thread{
    public ThreadExample(String name) {
        super(name);
    }

    public void run(){
        int i=1;
        while(i <= 20) {
            System.out.println("Hello! " + getName() + " Id:" + getId() + " Priority:" + getPriority());
            i++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadExample t1 = new ThreadExample("AjayThread");
        RunnableThreadExample rt = new RunnableThreadExample();
        t1.setPriority(Thread.MAX_PRIORITY);
        ThreadExample t2 = new ThreadExample("NandiniThread");
        Thread t3 = new Thread(rt, "SamThread");
        t1.start();
        t3.start();
        t3.join();
        t2.start();

    }
}

class RunnableThreadExample implements Runnable{


    @Override
    public void run() {
        int i=1;
        while(i <= 20) {
            System.out.println("Hello! Runnable " + Thread.currentThread().getName() + " Id:" + Thread.currentThread().getId() + " Priority:"+ Thread.currentThread().getPriority());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
