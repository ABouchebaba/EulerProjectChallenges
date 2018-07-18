package com.company;
/*
    Names scores : sum of (alphaValues*position)
    names source : names.txt
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args)throws IOException {

        long startTime = System.currentTimeMillis();

        int result = 0;

        String[] names = getNameArray("names.txt");
        Arrays.sort(names);

        for (int j=0; j<names.length; j++) result += (alphaValue(names[j])*(j+1));

        System.out.println( result );
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }

    public static String[] getNameArray(String filename){

        List<String> names= new ArrayList<>();
        int buf = 64;
        String name;

        try{

            File file = new File(filename);
            FileReader reader= new FileReader(file);

            while (buf != -1){ // while end of file not reached yet

                buf = reader.read();// read the '"' start of the name

                if (buf == '"'){// start of a name
                    buf = reader.read();
                    name = "";
                    while (buf != '"'){ // while end of name not reached yet

                        name += (char)buf;
                        buf = reader.read();
                    }

                    names.add(name);
                    reader.read(); // read the comma ','
                }
            }

        }catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + filename + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + filename + "'");
        }

        String[] namesArray = new String[names.size()];
        namesArray = names.toArray(namesArray);

        return namesArray;
    }

    public static int alphaValue(String s){

        int result = 0;
        for (int i=0; i<s.length(); i++)  result += (s.charAt(i) - 64);

        return result;
    }
}