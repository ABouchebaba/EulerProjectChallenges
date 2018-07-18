package com.company;
/*
    Digit cancelling fractions 49/98 = 4/8 (cancelling 9s)
 */

public class Main {

    private static int nominators[] = new int[4];
    private static int denominators[] = new int[4];
    private static int index = 0;

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        for (int i=10; i<100 && index<4; i++){
            for (int j=i+1; j<100 && index<4; j++){

                if( (i/(float)j) == simplified(i,j)){

                    nominators[index] = i;
                    denominators[index++] = j;
                }
            }
        }

        int n = 1, d =1;
        for (int k=0; k<index; k++){
            n *= nominators[k];
            d *= denominators[k];
        }

        System.out.println("result = "+d/n);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");

    }


    private static float simplified(int a, int b){

        if (a%10 == 0 && b%10 == 0) return 0;

        String a1 = ""+a, b1 = ""+b;

        boolean intersection = false;

        for (int i=0; i<a1.length(); i++){
            if (b1.contains(""+a1.charAt(i))){
                b1 = b1.replaceFirst(""+a1.charAt(i), "");
                a1 = a1.replaceFirst(""+a1.charAt(i), "");
                intersection = true;
            }
        }
        if (!intersection) return 0;

        a = Integer.parseInt(a1);
        b = Integer.parseInt(b1);

        return a/(float)b;
    }
}