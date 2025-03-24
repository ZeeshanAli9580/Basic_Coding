package com.number;

public class GlobaleAndLocalVariable {
    int a = 10;
    static int  b = 20;

    // both variable are globe variable
    public static void main(String[] args) {
         // a can not be accessible inside the static method
        //System.out.println(a);
        System.out.println(b);
    }
    public void m1()
    {
        int z=30; // local variable
        System.out.println(a);
        System.out.println(b);
    }
    public static void m2 ()
    {
        // local variable of other methods or black can not be access
       // System.out.println(z);
        System.out.println(b);
    }

}
