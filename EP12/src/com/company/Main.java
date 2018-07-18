package com.company;
/*
    Highly divisible(500 divisors) triangle number
 */


public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        long n = 0;
        int result = 0;

        while ( numberOfDivisors(result) < 500) {

            if (n % 2 == 0)
                result += n++;
            else{
                result += 3*n+3;
                n+=3;
            }

        }

        System.out.println(result);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        System.out.println(elapsedTime);



    }

    public static int numberOfDivisors(long n){
        int counter;
        int dividers = 1;

        long currentPrime = 2;
        long Bn = n;

        while(Bn > 1){
            counter=1;
            while (Bn % currentPrime == 0){
                counter++;
                Bn /= currentPrime;
            }
            currentPrime ++;// BigInteger.valueOf(currentPrime).nextProbablePrime().longValue();
            dividers *= counter;
        }

        return dividers;
    }
}
