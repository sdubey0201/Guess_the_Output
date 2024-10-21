package com.sd.java.exampls;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Integer a = 100;
        Integer b= 100;
        Integer c = 400;
        Integer d = 400;

        if (a == b){
            System.out.println("a and b are equal");
        }if (c == d){
            System.out.println("c and d are equal");
        }if (c.equals(d)){
            System.out.println("c and d are equal with equals");
        }
    }
}