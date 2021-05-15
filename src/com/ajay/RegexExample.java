package com.ajay;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String s = "Anyone can help";
        String pattern = "[a-z]+";
        Pattern cp = Pattern.compile(pattern);
        Matcher m = cp.matcher(s);
        while (m.find()) {
            System.out.println(s.substring(m.start(), m.end()));
        }
    }
}
