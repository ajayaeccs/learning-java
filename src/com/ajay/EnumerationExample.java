package com.ajay;

public class EnumerationExample {
    public static void main(String[] args) {
        for(Color c : Color.values()){
            System.out.println(c + ":" + c.getValue());
        }
    }
}

enum Color{
    RED("red"), GREEN("green"), BLUE("blue");

    private String value;

    Color(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
