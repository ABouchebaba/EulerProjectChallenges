package com.company;
/*
    special pythagorien triplet (sum(a,b,c) = 1000)
 */

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        double a=0, b=0, c=0;
        double result = 1;

        for(a=0; a<1000; a++){
            for (b=a+1; b<1000; b++){
                c = Math.sqrt(a*a+b*b);
                if (a+b+c == 1000)
                    result = a*b*c;
            }
        }

        System.out.printf("result = %f \n", result);
        System.out.println("Execution time : "+(System.currentTimeMillis() - startTime));
    }
}
