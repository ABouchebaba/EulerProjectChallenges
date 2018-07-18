package com.company;


/*
    Shit solution

 */

public class Main {

    static int statics[] = new int[]{1, 2, 5, 10, 20, 50, 100, 200};

    public static void main(String[] args) {

        int result = 0;




        for (int a=0; a<=1; a++){
            for (int b=0; b<=2; b++){
                for (int c=0; c<=4; c++){
                    for (int d=0; d<=10; d++){
                        for (int e=0; e<=20; e++){
                            for (int f=0; f<=40; f++){
                                for (int g=0; g<=100; g++){
                                    for (int h=0; h<=200; h++){
                                        if (equalsTwoPounds(new int[]{a,b,c,d,e,f,g,h})){
                                            result ++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(result);


    }

    public static boolean equalsTwoPounds(int values[]){

        int result = 0;

        result += values[0]*200 + values[1]*100 + values[2]*50 + values[3]*20 + values[4]*10 + values[5]*5 + values[6]*2 + values[7]*1;


        return (result == 200);
    }
}
