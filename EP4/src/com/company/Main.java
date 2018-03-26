package com.company;
/*
    Largest palindrome product
 */

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        int result = 0;

        for (int i=100; i<1000; i++){

            for (int j=100; j<1000; j++){
                if (isPalindromic(i*j)){
                    if (i*j > result)
                        result = i*j;
                }
            }
        }

        System.out.println("result = "+result);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    public static boolean isPalindromic(int n){

        String a = Integer.toString(n);
        String b = new StringBuilder(Integer.toString(n)).reverse().toString();

        return  (a.compareTo(b)) == 0;
    }
}
