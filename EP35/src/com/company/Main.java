package com.company;
/*
    Circular primes : find primes that stay prime after every possible rotation
 */

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int result = 0;

        for (int i=2; i<1000000; i++){

            if(!hasAnEvenDigit(i) || i == 2){
                if(allRotationsArePrime(i)) result++;
            }
        }

        System.out.println("result = "+result);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    public static boolean hasAnEvenDigit(int n){

        String number = Integer.toString(n);

        return number.contains("0") || number.contains("2") || number.contains("4") || number.contains("6") || number.contains("8");
    }


    public  static boolean allRotationsArePrime(int n){

        int nbRotations = Integer.toString(n).length();

        for (int i=0; i<nbRotations; i++){

            if(!isPrime(rotation(n))) return false;

            n = rotation(n);
        }
        return true;
    }


    public static boolean isPrime(int n){

        for (int i=2; i*i<=n; i++){
            if (n%i == 0) return false;
        }
        return (n > 1);
    }

    public static int rotation(int n){

        char nArray[] = Integer.toString(n).toCharArray();
        char tmp = nArray[0];

        for (int i=0; i<nArray.length-1; i++) nArray[i] = nArray[i+1];

        nArray[nArray.length-1] = tmp;

        return Integer.parseInt(String.copyValueOf(nArray));
    }
}
