package com.company;
/*
    difference between sum of squares & square of sum
 */

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        int n1 =0, n2=0, result ;

        for(int i=0; i<=100; i++){

            n1 += i;
            n2 += i*i;
        }
        result = n1*n1 - n2;
        
        System.out.println("result = "+result);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }
}
