package com.company;
/*
    Sub-string divisibility :
 */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        long result = 0;
        String tmp ;

        for (int i= fact(10)-1; i>0; i--){

            tmp = getIthPandigit(i, 9);
            if (verifiesProperty(tmp)) result += Long.parseLong(tmp);
        }

        System.out.println("result = "+result);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    public static boolean verifiesProperty(String number){

        int primes[] = new int[]{2, 3, 5, 7, 11, 13, 17};

        for (int i=0; i<primes.length; i++){
            if (Integer.parseInt(number.substring(i+1, i+4)) % primes[i] != 0)
                return false;
        }
        return true;
    }

    public static String getIthPandigit(int i, int k){

        List<Integer> digits = new ArrayList<>();

        for(int j=0; j<=k; j++) digits.add(j); //initailise digits

        int position= i;
        String result = "";

        for (int j=k; j>=0; j--){

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

        for (int i=2; i<=n; i++){
            result *= i;
        }
        return result;
    }
}
