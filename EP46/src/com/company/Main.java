package com.company;
/*
    Goldbach's other conjecture : find a composite odd number that is not a sum of a prime & 2 time a square
 */

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int number = 33;

        while(isSumOfPrimeAndTwiceASquare(number)) number+=2;

        System.out.println("result = "+ number);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    public static boolean isSumOfPrimeAndTwiceASquare(int number){

        if (isPrime(number)) return true;

        for(int i = 1; i<number; i++){

            if(isPrime(i)){
                if (isSquare((number-i)/2))
                    return true;
            }
        }
        return false;
    }

    public static boolean isPrime(int n){

        for (int i = 2; i*i <= n; i++){
            if (n%i == 0)
                return false;
        }
        return (n>1);
    }

    public static boolean isSquare(int n){

        int i = 1;

        while(i*i < n) i++;

        return (i*i == n);
    }
}
