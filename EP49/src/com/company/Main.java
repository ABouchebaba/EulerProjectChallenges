package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis(), endTime;

        ArrayList<ArrayList<Integer>> primes = new ArrayList<>();

        for (int i = 1001; i<10000; i+=2){

            if (isPrime(i)){
                boolean inserted = false;
                for (int j=0; j<primes.size(); j++){
                    ArrayList<Integer> tmp = primes.get(j);
                    for (int k =0; k<tmp.size(); k++){
                        if (isPermutation(i, tmp.get(k))){
                            tmp.add(i);
                            inserted = true;

//                            System.out.println("inserted");
                            break;
                        }
                    }
                }
                if (!inserted){
//                    System.out.println("not inserted");
                    ArrayList<Integer> tmp = new ArrayList<>();
                    tmp.add(i);
                    primes.add(tmp);
                }
            }
        }

        for (int i=0; i<primes.size(); i++){
            ArrayList<Integer> tmp = primes.get(i);
            int size = tmp.size();
            if (size>= 3){
                for (int j =0; j<size; j++){
                    int first = tmp.get(j);
                    for (int k =j+1; k<size; k++){
                        int second = tmp.get(k);
                        int third = 2*tmp.get(k)-tmp.get(j);

                        if (tmp.contains(third)){
                            System.out.println(first+ " "+second+" "+third);
                        }
                    }
                }
            }

        }

        endTime = System.currentTimeMillis();
        System.out.println("Execution time : "+ (endTime-startTime));

    }

    private static boolean isPrime(int n){

        if (n%2 == 0) return false;

        int m ;

        for (m=3; m*m<= n; m+=2){
            if (n%m == 0) return false;
        }

        return (n != 1);
    }
    private static boolean isPermutation(int n1, int n2){

        char[] a = Integer.toString(n1).toCharArray();
        char[] b = Integer.toString(n2).toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}
