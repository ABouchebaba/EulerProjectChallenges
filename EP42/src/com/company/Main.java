package com.company;
/*
    Coded triangle numbers : find the words (from words.txt) whose value is a triangle number
 */

import java.io.*;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int result = 0;
        String words[] = getWords("words.txt");

        for (int i=0; i<words.length; i++){

            if(isTriangle(words[i])) result ++;
        }

        System.out.println("result = "+result);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    public static String[] getWords(String fileName){

        String words = "";

        // Getting the words from the file
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            words = bufferedReader.readLine(); // since all the words are in one line
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }

        String result[] = words.split(",");

        // Getting rid of ""
        for (int i=0; i<result.length; i++)
            result[i]= result[i].substring(1,result[i].length()-1);

        return result;
    }

    public static boolean isTriangle(String word){

        int value = wordValue(word);
        int  i = 1, tmp = 0;

        while(tmp < value){
            tmp  = (i*(i+1))/2;
            i++;
        }

        return (tmp == value);
    }

    public static int wordValue(String word){
        int result = 0;

        for (int i=0; i<word.length(); i++ ) result += alphabeticalValue(word.charAt(i));

        return result;
    }

    public static int alphabeticalValue(char c){ // only works for capital letters
        return (int)c - 64;
    }
}