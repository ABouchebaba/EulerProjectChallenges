package com.company;
/*
    Lexicographic permutations : like N-th pandigital
 */
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        System.out.println("result = "+getNthPandigit(999999));

        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    public static int fact(int n){

        int result = 1;

        for (int i=1; i<=n; i++) result *= i;

        return result;
    }

    public static String getNthPandigit(int i){

        List<Integer> digits = new ArrayList<>();

        //initailise digits
        for(int j=0; j<=9; j++) digits.add(j);

        int position= i;
        String result = "";

        for (int j=9; j>=0; j--){

            int f = fact(j);
            int n = position / f;

            position = position % f ;
            result += ""+digits.get(n);
            digits.remove(n);
        }
        return result;
    }
}