package com.company;
/*
    sum of all primes < 2 000 000
    #slow (like 2 s)
 */

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        long result = 0, i = 2;

        while( i < 2000000){

            if (isPrime(i)) result += i;

            i++;
        }
        
        System.out.println("result = "+result);
        System.out.println("Execution time : "+(System.currentTimeMillis() - startTime)+" ms");
    }


    public static boolean isPrime(long n){
        for (int i=2; i*i<=n; i++){
            if (n%i == 0)
                return  false;
        }
        return (n > 1);
    }
}
