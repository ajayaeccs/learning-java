package com.ajay;

public class SynchronizationDemo {
    public static void main(String[] args) {
        Utils mu = new Utils();
        Thread1 t1 = new Thread1(mu);
        Thread2 t2 = new Thread2(mu);

        t1.start();
        t2.start();
    }
}

class Thread1 extends Thread{
    Utils mu;

    public Thread1(Utils mu) {
        this.mu = mu;
    }

    public void run(){
        try {
            mu.getTenMultiples(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread2 extends Thread{
    Utils mu;

    public Thread2(Utils mu) {
        this.mu = mu;
    }

    public void run(){
        try {
            mu.getTenMultiples(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Utils{
    public void getTenMultiples(int n) throws InterruptedException {
        synchronized(this) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i * n);
                Thread.sleep(100);
            }
        }
    }
}