package com.company;
/*
    Counting sundays
 */

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int[] monthsLengths = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 0 => Saturday , .... , 6 => friday

        int year;
        int firstOfMonth = 2;
        int cpt = 0;

        firstOfMonth += 365;
        firstOfMonth %= 7;

        for (year =  1901; year <= 2000; year++){

            for (int i=0; i<12; i++){

                if (firstOfMonth == 1) cpt++;

                if(i == 1){
                    if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0))
                        firstOfMonth = ((firstOfMonth+29)%7);
                }
                else
                    firstOfMonth = ((firstOfMonth+monthsLengths[i])%7);
            }
        }
        System.out.println(cpt);

        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }
}