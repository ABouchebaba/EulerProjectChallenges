package com.company;
/*
    1000-digit Fibonacci number
 */

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        System.out.println(nDigitFibonacciNumberIndex(1000));
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    public static int nDigitFibonacciNumberIndex(int n){
        int result = 3;
        BigInteger  a = BigInteger.ONE,
                    b = BigInteger.ONE,
                    c = BigInteger.ONE;

        while (c.toString().length() < n){

            c = b.add(a);
            a = b;
            b = c;
            result++;
        }
        return result;
    }
}