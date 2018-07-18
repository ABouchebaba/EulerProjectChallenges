package com.company;
/*
    Champernowne's constant : concatenation of numbers (>=0)
        find the N-th position digit in that constant
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int result = 1;

        for (int j=0; j<=6; j++) result *= getIthDigit((int)Math.pow(10, j));

        System.out.println("result = "+result);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");

    }
    public static int getIthDigit(int position){

        ArrayList<Integer> startings = new ArrayList<>();
        initStartingIndexes(startings, 6);

        int wantedPosition = position, offset , nbDigits , digitIndex, nearestPowerOfTen ;

        nearestPowerOfTen = nearestPowerOfTenIndex(startings, wantedPosition);
        offset = wantedPosition - nearestPowerOfTen;
        nbDigits = Integer.toString(nearestPowerOfTen).length();
        digitIndex = offset/nbDigits;

        if (nbDigits != 1)// position 1 starts at 0
            digitIndex += (int)Math.pow(10, nbDigits-1);

        return Integer.parseInt(""+Integer.toString(digitIndex).charAt(offset%nbDigits));
    }

    public static void initStartingIndexes(ArrayList<Integer> startings, int maxDigits){ // works until 7-digit numbers

        int tmp = 0, i = 0;
        int max = (int)Math.pow(10, maxDigits);
        startings.add(0);

        while(tmp < max){
            tmp += 9*(int)Math.pow(10, i)*++i;
            startings.add(tmp+1);
        }
    }

    public static int nearestPowerOfTenIndex(ArrayList l, int value){

        int listSize = l.size();

        for (int i=0; i<listSize; i++){
            if ((int)l.get(i) > value) return (int)l.get(i-1);
        }
        return (int)l.get(listSize-1);
    }
}
