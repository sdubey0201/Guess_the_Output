package com.sd.java.exampls;

public class FinallyBlockTest {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Inside catch block");
        } finally {
            System.out.println("Inside Finally block");
        }
    }
}
