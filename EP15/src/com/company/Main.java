package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int gridsize = 20;
        BigInteger result;
        result = fact(2*gridsize).divide(fact(gridsize).multiply(fact(gridsize)));
        System.out.println(result);

        System.out.println("Execution time : "+ (System.currentTimeMillis()-startTime)+" ms");


    }

    public static BigInteger fact(int n){
        BigInteger result= new BigInteger("1");
        for (int i=1; i<= n; i++){
            result = result.multiply(new BigInteger(""+ i));
        }
        return result;
    }

}
