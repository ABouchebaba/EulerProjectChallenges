package com.company;
/*
    Double-base palindromes : find numbers that are palindromes in both base 10 and 2
 */

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int result = 0;

        for (int i=0; i< 1000000; i++){

            if (isPalindromic(""+i) && isPalindromic(binary(i))) result += i;
        }

        System.out.println("resut = "+result);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    public static boolean isPalindromic(String n){

        if (n.length() == 1) return true;

        int i1 = n.length()/2-1;
        int i2 = n.length()/2 ;

        if (n.length()%2 == 1) i2++;

        for (;i1 >= 0 || i2 < n.length(); i1--, i2++){

            if (n.charAt(i1) != n.charAt(i2))return false;
        }
        return true;
    }

    public static String binary(int n){

        return Integer.toBinaryString(n);
    }
}
