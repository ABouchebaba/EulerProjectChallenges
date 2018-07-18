package com.company;
/*
    Pandigital prime : find the largest one of those
 */

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int i = fact(9)-1, j = 9;
        String number = "";

        while (i > 0 || j > 0){

            number = getIthPandigit(i--, j);
            int n = Integer.parseInt(number);

            if (isPrime(n))break;
            if (i == 0){
                j--;
                i = fact(j)-1;
            }
        }


        System.out.println("result = "+number);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    public static String getIthPandigit(int i, int k){

        List<Integer> digits = new ArrayList<>();

        //initailise digits
        for(int j=1; j<=k; j++) digits.add(j);

        int position = i;
        String result = "";

        for (int j=k-1; j>=0; j--){

            int f = fact(j);
            int n = position / f;

            position = position % f ;
            result += ""+digits.get(n);
            digits.remove(n);
        }
        return result;
    }

    public static int fact(int n){

        int result = 1;

        for (int i=1; i<=n; i++) result *= i;

        return result;
    }

    public static boolean isPrime(int n){
        for (int i =2; i*i <= n; i++){
            if (n%i == 0) return false;
        }
        return (n > 1);
    }
}
