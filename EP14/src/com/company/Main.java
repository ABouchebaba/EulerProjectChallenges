package com.company;
/*
    Longest Collatz sequence for numbers < 1 000 000
 */

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int result = 0, sup =  0, m;
        for (int i=1; i<1000000; i++){

            if ( (m=collatzLength(i)) > sup){
                sup = m;
                result = i;
            }
        }

        System.out.println(result);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime));
    }



    public static long collatz(long n){

        if (n % 2 == 0)
            return n/2;
        else
            return 3*n+1;
    }

    public static int collatzLength(int n){

        int counter =0;
        long next = collatz(n);

        while (next != 1){
            next = collatz(next);
            counter++;
        }

        return counter;
    }
}
