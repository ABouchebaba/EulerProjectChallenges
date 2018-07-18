package com.company;
/*
    Truncatable primes : find primes that stay primes after removing (left/right)side digits
 */

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int result = 0;
        int count = 0;
        int i = 11; // first prime after 7

        while (count < 11){

            if(isLeftRightPrime(i)){
                count++;
                result += i;
            }
            i+=2;
        }

        System.out.println("result = "+result);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    private static boolean isLeftRightPrime(int n){

        return isLeftPrime(n) && isRightPrime(n);
    }

    private static boolean isLeftPrime(int n){
        int len = Integer.toString(n).length();
        int tmp = n;

        while (len >= 0){

            if (!isPrime(tmp)) return false;

            tmp %= (int)Math.pow(10, len--);
        }
        return true;
    }

    private static boolean isRightPrime(int n){

        int tmp = n;

        while (tmp > 0){
            if (!isPrime(tmp))return false;

            tmp = tmp /10;
        }
        return true;
    }

    private static boolean isPrime(int n){

        for (int i=2; i*i<= n; i++){
            if (n%i == 0)return false;
        }
        return (n > 1);
    }
}
