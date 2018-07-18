package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        BigInteger a = BigInteger.valueOf(2).pow(1000);

        String b[] = a.toString().split("");

        int result = 0;

        for (int i=0; i<b.length; i++){
            result += Integer.parseInt(b[i]);
        }

        System.out.println(result);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }
}
