package com.company;
/*
    Pandigital products : find  a b (c=a*b) for which "abc" is pandigital
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int result = 0;
        Set<Integer> history = new TreeSet<>();
        int max = fact(9), product;
        String number ;

        for (int i =0; i<max; i++){
            number = getIthPandigit(i, 9);
            product  = Integer.parseInt(number.substring(5));
            if (isProductPandigit(Integer.parseInt(number)) && !history.contains(product)){

                history.add(product);
                result += product;
            }
        }

        System.out.println("result = "+result);
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

    public static boolean isProductPandigit(int n){
        String number = Integer.toString(n);
        int maxLength  = (number.length()+1)/2;
        int i , j, k = Integer.parseInt(number.substring(maxLength));

        for (int x=1; x <maxLength; x++){

            i = Integer.parseInt(number.substring(0, x));
            j = Integer.parseInt(number.substring(x, maxLength));

            if (i*j == k)
                return  true;
        }
        return false;
    }
}
