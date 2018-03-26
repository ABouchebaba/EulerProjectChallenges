package com.company;
/*
    gets the n-th prime number
 */

public class Main {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        long result = primeNumber(10001);

        System.out.println("result = "+result);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    private  static long primeNumber(int n){

        int counter = 0, i =2;

        while(counter < n){
            if (isPrime(i++))
                counter++;
        }

        return i-1;
    }

    private static boolean isPrime(long n){

        for (int i=2; i*i<= n; i++){
            if (n % i == 0)
                return false;
        }
        return (n > 1);
    }
}