package com.company;
/*
    Triangular, pentagonal, and hexagonal
 */


public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        long indexT = 286, indexP = 166, indexH = 144;
        long pValue ;

        while(true){

            pValue = pentagonal(indexP);
            while(triangle(indexT) < pValue) indexT++;

            if (triangle(indexT) == pValue){

                long tValue = triangle(indexT);

                while(hexagonal(indexH) < tValue) indexH++;

                if (hexagonal(indexH) == tValue) break;
            }
            else indexP++;

            indexT++;
        }

        System.out.println("result = "+triangle(indexT));
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    public static long triangle(long n){
        return n*(n+1)/2;
    }
    public static long pentagonal(long n){
        return n*(3*n-1)/2;
    }
    public static long hexagonal(long n){
        return n*(2*n-1);
    }
}
