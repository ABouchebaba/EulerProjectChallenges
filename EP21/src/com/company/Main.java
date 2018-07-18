package com.company;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int result = 0;
        for (int i=1; i<=10000; i++){
            if( i == d(d(i)) && i != d(i))
                result += i;

        }

        System.out.println("result = "+result);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    // sum of proper dividors of n
    public static int d(int n){

        int result = 0;
        for(int i=1; i<=n/2; i++){

            if (n%i == 0){
                result += i;
            }
        }

        return result;
    }
}
