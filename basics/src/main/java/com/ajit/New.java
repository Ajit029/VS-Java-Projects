package com.ajit;

import java.util.List;

public class New {
    public static void main(String[] args) {
        List<String> items = List.of("1", "a", "2", "a", "3", "a");
        items.forEach(item -> {
            if (item.equals("a")) {
                System.out.println("A");
            } else {
                System.out.println("Not A");
            }
        });
    }

}
