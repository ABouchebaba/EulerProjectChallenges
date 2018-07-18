package com.company;
/*
    Distinct powers : how many different a^b are there for :
    2<=a<=100 , 2<=b<=100
 */

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        System.out.println(numberOfDistinctPowers(100, 100));

        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    public static int numberOfDistinctPowers(int aUpperLimit, int bUpperLimit){

        Set<Double> values = new TreeSet<>();

        for (int a=2; a<=aUpperLimit; a++){
            for (int b =2; b<=bUpperLimit; b++) values.add(Math.pow(a,b));
        }
        return values.size();
    }
}
