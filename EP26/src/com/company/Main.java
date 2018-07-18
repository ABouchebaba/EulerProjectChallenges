package com.company;
/*
    reciprocal cycles : longest decimal period
 */

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int result = 0;
        int maxPeriod = 0;

        for (int i =10;i< 1000; i++){

            int p = periodLength(i);

            if (p > maxPeriod){
                maxPeriod = p;
                result = i;
            }
        }

        System.out.println(result);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    public static int periodLength(int number){
        int result = 1;

        BigInteger n = BigInteger.valueOf(number);
        BigInteger two = BigInteger.valueOf(2),
                five = BigInteger.valueOf(5);

        while (n.mod(two).compareTo(BigInteger.ZERO) == 0) n = n.divide(two);

        while (n.mod(five).compareTo(BigInteger.ZERO) == 0) n = n.divide(five);

        if (n.compareTo(BigInteger.ONE) == 0) return 0;

        while (BigInteger.TEN.pow(result).mod(n).compareTo(BigInteger.ONE) != 0) result++;

        return result;
    }

    public  static String reverseScaled(int n, int precision){

        String result = "";
        int i = 0, div = 1;

        while(i < precision){

            result += (""+ div/n);
            div %= n;

            if (div < n) div*= 10;
            i++;
        }
        return result.substring(1); // eliminate the first 0
    }
}
