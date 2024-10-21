package com.sd.java.exampls;

public class Example6 {
    public static void main(String[] args) {
        method(null);
    }public static void method(Object o){
        System.out.println("Object method called");
    }public static void method(String o){
        System.out.println("String method called");
    }
}
