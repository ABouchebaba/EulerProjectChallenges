package com.company;
/*
    Quadratic primes : find a & b to get a quadratic formula
    that generates the most prime numbers
 */

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int result = 0;
        int a , b, max = 0 ;

        for (a = 999; a>= -999; a-=2){

            for (b= 999; b >= -999; b-=2){
                if (isPrime(b)){
                    int n = 0;
                    while(isPrime(E(n, a, b)) ) n++;

                    if(n > max){
                        max = n;
                        result = a*b;
                    }
                }
            }
        }
        System.out.println("result  = "+result);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    public static int E(int n, int a, int b){

        return  n*n + a*n + b;
    }

    public static boolean isPrime(int n){

        int m = Math.abs(n);

        for (int i=2; i*i<=m; i++){
            if (n%i == 0) return false;
        }
        return true;
    }
}
