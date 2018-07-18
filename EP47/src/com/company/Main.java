package com.company;
/*
    Distinct primes factors : find 4 successive number that have 4 distinct prime factors
 */


public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int number = 2*3*5*7;

        while(!hasFourConsecutive(number)) number++;

        System.out.println("result = "+ number);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    public static boolean hasFourConsecutive(int number){

        int currentPrime, tmp ;
        int counter ;

        for (int current = number; current < number+4; current++){

            currentPrime = 2;
            counter = 0;
            tmp = current;

            while(tmp > 1){

                if (tmp % currentPrime == 0){
                    counter++;
                    while(tmp % currentPrime == 0) tmp /= currentPrime;
                }
                currentPrime++;
            }
            if (counter != 4) return false;
        }
        return true;
    }
}
