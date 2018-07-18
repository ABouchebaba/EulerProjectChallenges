package com.company;


public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int result ;
        int a=5,b=6;

        while(true){

            if (isPenta(penta(b)-penta(a))){

                if (isPenta(penta(a)+penta(b))){
                    result = penta(b) - penta(a);
                    break;
                }
            }

            b++;

            //penta(b+1)-penta(b) = 3 * b + 4
            while( 3*b+4 > penta(a)){
                a++;
                b = a+1;

            }

        }

        System.out.println("result = "+result);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime));

    }

    public static int penta(int index){return index*(3*index-1)/2;}

    public static boolean isPenta(int n){

        double tmp = (1+Math.sqrt(1+24*n))/6;

        int index = (int) tmp;

        return (penta(index) == n);

    }


}