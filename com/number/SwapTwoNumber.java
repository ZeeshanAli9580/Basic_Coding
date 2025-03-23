package com.number;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        // swapping the number with addition without third variable
        System.out.println("Before swapping the number is : " +a +" "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("-----------------------------------------");
        System.out.println("After swapping the number is : " +a +"  "+b);
        // using multiplication method
        System.out.println("-----------------------------------------");
        System.out.println("Before swapping the number is : " +a +" "+b);
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println("After swapping the number is : " +a +" "+b);




    }
}
