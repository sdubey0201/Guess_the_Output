package com.sd.java.exampls;

public class Example7 {
    public static void main(String[] args) {
     A a = new A();
     A a2 = new A();
    }
    static class  A{
        static {
            System.out.print("1");
        }
        {
            System.out.print("2");
        }
        public A(){
            System.out.print("3");
        }
    }
}
