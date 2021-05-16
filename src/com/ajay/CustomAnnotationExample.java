package com.ajay;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


public class CustomAnnotationExample {
    @CustomAnnotation(value=10)
    public void method1(){
        System.out.println("Hello! Ajay");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        CustomAnnotationExample h = new CustomAnnotationExample();
        Method methodval = h.getClass().getMethod("method1");

        CustomAnnotation ca = methodval.getAnnotation(CustomAnnotation.class);
        System.out.println(ca.value());
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CustomAnnotation{
    int value();
}