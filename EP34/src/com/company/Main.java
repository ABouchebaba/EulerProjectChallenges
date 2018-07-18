package com.company;
/*
        Digit factorials : numbers == sum facto(digits)
        Tested max values from 1000 to 100000 to get a max value
 */

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();


        int result = 0;
        for (int i = 10; i<100000; i++){

            if (digitFactoSum(i) == i) result += i;
        }

        System.out.println(result);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    public static  int digitFactoSum(int n){

        int result = 0;

        while (n != 0){

            result += facto(n%10);
            n /= 10;
        }
        return result;
    }

    public static int facto(int n){

        int result = 1;

        for (int i=1; i<=n; i++) result *= i;

        return result;
    }
}
