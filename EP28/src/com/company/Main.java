package com.company;
/*
    Number spiral diagonals : sum of all numbers in the diagonals
 */

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        System.out.println("result  = "+sumOfDiagonalNumber(1001));

        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    public static long sumOfDiagonalNumber(int size){
        long result = 1;

        for (int i= 3; i<= size; i+=2){

            int iSqrt = i*i;

            result += iSqrt;
            result += iSqrt - i +1;
            result += iSqrt - 2*i +2;
            result += iSqrt - 3*i +3;

        }
        return result;
    }
}