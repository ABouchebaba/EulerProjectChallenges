package com.company;
/*
    Smallest multiple of all integers from 1 to 20
 */

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        int result = 1;
        boolean verif = true;

        for (int i =2; i<=20; i++){
            verif = true;

            if (result%i != 0){

                for (int j=1; j<=i && verif; j++){
                    if ((result*j)%i == 0){
                        result*=j;
                        verif = false;
                    }

                }
            }
        }

        System.out.println("result = "+result);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }
}
