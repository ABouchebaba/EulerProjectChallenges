package com.company;
/*
    Largest Prime factor of 600851475143
 */

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        long value = Long.valueOf("600851475143") ;
        long currentDivisor = 2;
        long result  = 0;

        while(value > 1){
            while(value % currentDivisor == 0) value /= currentDivisor;

            if(currentDivisor > result) result = currentDivisor;

            currentDivisor++;
        }

        System.out.println("result = "+result);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }
}
