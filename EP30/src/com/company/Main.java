package com.company;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();



        System.out.println("result = "+getSum(5));
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    public static int getSum(int power){

        int result = 0;
        int i = 2;
        long maxValue = (power+1)*(int)Math.pow(9,power);
        while(i < maxValue){
            if(isSumPower(i, power))  result += i;

            i++;
        }
        return result;
    }

    public static boolean isSumPower(int n, int power){

        int tmp = n;
        int m =0;

        while(tmp > 0){

            m += Math.pow(tmp%10, power);
            tmp /= 10;
        }
        return (n == m);
    }
}
