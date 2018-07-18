package com.company;
/*
    Pandigital multiples
 */

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int result = 0;
        String pan  ;
        int j ;

        for (int i=1; i < 9876; i++){
            pan  = "";
            j = 1;
            while(pan.length() < 9) pan += (""+j++*i);

            if (pan.length() != 9 )continue;

            if (isPandigital(pan)){
                int value = Integer.parseInt(pan);

                if (value > result) result = value;
            }
        }

        System.out.println("result = "+result);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    public static boolean isPandigital(String s){

        if (s.length() != 9) return false;

        boolean isPresent[] = new boolean[]{true, false, false, false, false, false, false, false, false, false};

        for (int i=0; i<s.length(); i++){
            isPresent[Integer.parseInt(""+s.charAt(i))] = true;
        }

        for (int i=0; i<isPresent.length; i++){
            if (!isPresent[i])return false;
        }
        return true;
    }
}
