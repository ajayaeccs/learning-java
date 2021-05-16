package com.ajay;

interface AnoDemo{
    public void method1();
    public void method2();
}

@FunctionalInterface
interface LamdaDemo{
    public void method1(int a);
}

public class AnonymousClassAndLambdaExample {
    public static void main(String[] args) {
        AnoDemo obj1 = new AnoDemo() {  //Anonymous class Example
            @Override
            public void method1() {
                System.out.println("I am method1");
            }

            @Override
            public void method2() {
                System.out.println("I am method2");
            }
        };
        obj1.method1();
        obj1.method2();

        LamdaDemo obj2 = (a)-> { System.out.println("I am method1 with param a="+a); };
        obj2.method1(6);
    }
}
