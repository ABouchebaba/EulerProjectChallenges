package com.company;
/*
    fibonacci terms below 4 000 000
 */

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int n1 = 1, n2 = 2, cur=2;
        int result = 0;

        while(cur <= 4000000){

            if (cur%2 == 0) result += cur;

            cur = n1 + n2;
            n1 = n2;
            n2 = cur;
        }
        System.out.println("result = "+result);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }
}
