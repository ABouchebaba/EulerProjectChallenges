package com.company;
/*
    Non-abundants sums :
        generate abundants in an arrayList
        use the list to find numbers which are not a sum of 2 abundants
    #slow (like 1s)
 */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int result = 0;
        List<Integer> abundantsList = new ArrayList<>();

        // get all abundant numbers until 28123
        for (int i=12; i<28123; i++){

            if(isAbundant(i)) abundantsList.add(i);
        }

        Integer[] abundants = new Integer[abundantsList.size()];
        abundants = abundantsList.toArray(abundants);

        for (int i = 0; i<28123; i++){

            if(!isSumOfTwoAbundants(i, abundants))
                result += i;
        }
        System.out.println("result = "+result);

        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
	}


	public static boolean isAbundant(int n){

        int dividersSum = 0;
        for (int i=1; i<= n/2; i++){

            if(n % i == 0) dividersSum += i;
        }
        return (dividersSum > n);
    }

    public static boolean isSumOfTwoAbundants(int n, Integer abundants[]){

	    int i = 0, j = abundants.length -1;

	    while(i <= j){
	        if (abundants[i] + abundants[j] == n) return true;
            else{
	            if (abundants[i] + abundants[j] < n) i++;
                else j--;
            }
        }
	    return false;
    }
}