package com.company;
/*
    Factorial digit sum
 */

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        System.out.println("result = "+digitSum(facto(100)));

        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    public static BigInteger digitSum(BigInteger n){
        BigInteger result = BigInteger.ZERO;
        String str = n.toString();
        int len = str.length();

        for (int i=0; i<len; i++) result = result.add(new BigInteger(str.charAt(i)+""));

        return result;
    }

    public static BigInteger facto(int n){

        BigInteger result = BigInteger.ONE;

        for (int i = 1; i<=n; i++)
            result = result.multiply(BigInteger.valueOf(i));

        return  result;
    }

}
