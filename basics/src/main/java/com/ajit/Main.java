package com.ajit;

public class Main {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2); //prints: true
        System.out.println("abc" == s1); //prints: true
    }
}