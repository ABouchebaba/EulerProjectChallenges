package com.company;
/*
    Maximum path sum : both problems 18(tree.txt) & 67(tree2.txt) can be solved with this  algorithm
    you will need the number of rows though (could be done with arrayList)
 */

import java.io.*;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        System.out.println("result = "+ maxLengthPath("tree2.txt", 100));

        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    public static int maxLengthPath(String filename, int size){

        int input[][] = new int[size][size];
        initInput(input, filename);

        int T[][] =new int[size][size];
        T[0][0] = input[0][0];

        for (int i=0; i< input.length-1; i++){

            for (int j=0; j<=i; j++) {
                if(T[i][j] + input[i+1][j] > T[i+1][j]){
                    T[i+1][j] = T[i][j] + input[i+1][j];
                }
                if(T[i][j] + input[i+1][j+1] > T[i+1][j+1]){
                    T[i+1][j+1] = T[i][j] + input[i+1][j+1];
                }
            }
        }
        return max(T[size-1]);
    }

    public static int max(int T[]){

        int max =0;
        for (int i=0; i< T.length; i++)
            if (T[i] > max) max = T[i];

        return max;
    }

    public static void initInput(int input[][], String filename){

        String fileName = filename, line;
        int j = 0;

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {

                String numbers[] = line.split(" ");
                for (int i=0; i<numbers.length; i++)
                    input[j][i] = Integer.parseInt(numbers[i]);

                j++;
            }
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }
    }
}