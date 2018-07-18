package com.company;
/*
    Number letter counts : number => words +( sum of words lengths)
 */

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int result = 0;

        for (int i=1; i<= 1000; i++)  result += intToWords(i, false).length();

        System.out.println(result);

        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    // can generate numbers from 1 to 1000
    public static String intToWords(int n, boolean spacesAndHyphens){

        String space = (spacesAndHyphens)? " " : "";
        String hyphen = (spacesAndHyphens)? "-" : "";

        String keyWords[][] = new String[][]{{"", "", "hundred", "thousand"}, //empty strings because of powers 0 & 1
                                            {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"},
                                            {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"},
                                            {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"}};

        int len = Integer.toString(n).length();
        int pow = len;
        String result = "";

        for (int i=len-1; i >= 2; i--){

            if (getDigit(n, i) > 0)  result += keyWords[3][getDigit(n, i)]+space+keyWords[0][i]+space;
        }
        if (n / 100 != 0 && n % 100 != 0)
            result += "and"+space ;

        n %= 100;
        if (n != 0){

            if(n < 20){
                if (n < 10)result += keyWords[3][n];

                else result += keyWords[2][n-10];
            }
            else{
                result += keyWords[1][n/10-2];
                if (n % 10 != 0) result += hyphen+keyWords[3][n%10];
            }
        }

        return result;
    }

    public static int getDigit(int n, int index){
        if (index >= Integer.toString(n).length() || index < 0)return -1;

        int pow = (int)Math.pow(10, index+1);
        return (n%pow)/(pow/10);
    }


}
