package com.sd.java.exampls;

public class FizzBuzzProblem {
    public static void main(String[] args) {

        int a = 6/3;
        int b = 6%3;
        System.out.println(a);
        System.out.println(b);


        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.printf(i+" ");
                System.out.println("FizzBuzz");
            }else if(i%3==0){
                System.out.print(i+" ");
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.print(i+" ");
                System.out.println("Buzz");
            }else{
//                System.out.println(i);
            }
        }
    }
}
