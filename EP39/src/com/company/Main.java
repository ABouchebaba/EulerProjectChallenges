package com.company;
/*
    Integer right triangles : find perimeter for which there is the most possible (a, b)s
 */

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int result = 0;
        int countArray[] = new int[1001];

        for (int a=1; a < 1000; a++){
            for (int b=1; b < 1000; b++){
                double c = Math.sqrt(a*a + b*b);

                if (!hasIntegerValue(c)) continue;

                if (a+b+c <= 1000 && integraleDifference(a,b,(int)c)) countArray[a+b+(int)c]++;
            }
        }
        result =  maxIndex(countArray) ;

        System.out.println("result = "+result);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    public static boolean hasIntegerValue(double d){

        return (10*d == 10*(int)d);
    }

    public static boolean integraleDifference(int a, int b, int c){
        return a<b && a<c && b<c;
    }


    public static int maxIndex(int a[]){

        int maxValue = 0;
        int result = 0;
        for (int i=0; i<a.length; i++){
            if (a[i] > maxValue){
                maxValue= a[i];
                result = i;
            }
        }
        return result;
    }
}