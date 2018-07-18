package com.company;
/*
    Self powers
 */

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        BigInteger sum = BigInteger.ZERO;

        for (int i =1; i<= 1000; i++) sum = sum.add(BigInteger.valueOf(i).pow(i));

        String result = sum.toString().substring(sum.toString().length()-10);

        System.out.println("result = "+ result);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");

    }

}
