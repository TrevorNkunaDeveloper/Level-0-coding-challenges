package com.example.Task010;
import java.util.Locale;
import java.util.Scanner;
import  java.lang.StringBuilder;

public class CommonCharacters {
    public static void main(String[] args){
        checkForCommonChars("lookook","book");
    }

    static void checkForCommonChars(String input1,String input2){
        String longerString = determineLongestString(input1,input2);
        String shorterString = determineShorterString(input1,input2);
        String sep =", ";

        System.out.print("Common letters: ");
        for(int x = 0; x < longerString.length(); x++){
            if(x == longerString.length()-1)
            {
                sep ="";
            }
            String line = Character.toString(longerString.charAt(x));

            for (int y = 0 ; y < shorterString.length(); y++){

                String line2 = Character.toString(shorterString.charAt(y));
                //To eliminate duplicates, exit loop if you find the first occurance
                if(line.equals(line2)){
                    System.out.print(line+sep);
                    y += shorterString.length()-1;
                }
            }
        }
    }

    static String determineLongestString(String input1,String input2){
        String firstString = input1.toLowerCase(), secondString = input2.toLowerCase();
        String longerString = secondString;

        if(firstString.length() < secondString.length() || firstString.length() == secondString.length()){
            longerString = firstString;
        }
        return longerString;
    }

    static String determineShorterString(String input1,String input2){
        String firstString = input1.toLowerCase(), secondString = input2.toLowerCase();
        String shorterString = secondString;

        if(firstString.length() > secondString.length()){
            shorterString = firstString;
        }
        return shorterString;
    }
}