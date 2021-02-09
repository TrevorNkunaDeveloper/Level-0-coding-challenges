package com.example.Task010;
import java.util.Locale;
import java.util.Scanner;
import  java.lang.StringBuilder;

public class CommonCharacters {
    public static void main(String[] args){

        check_for_common_chars("look","book");

    }
    static void check_for_common_chars(String input1,String input2){
        String firstString = input1.toLowerCase(), secondString = input2.toLowerCase();
        String primaryString, secondaryString, outString="", tempString ="", sep =", ";
        System.out.print("Common letters: ");

        // check which string is longer and assign it as primary string
        if(firstString.length() > secondString.length() || firstString.length() == secondString.length()){
            primaryString = firstString;
            secondaryString = secondString;
        }
        else{
            primaryString = secondString;
            secondaryString = firstString;
        }

        //For loop to find the common characters in the given string
        for(int x = 0; x < primaryString.length(); x++){
            if(x == primaryString.length()-1)
            {
                sep ="";
            }
            String strr = Character.toString(primaryString.charAt(x));

            for (int y = 0 ; y < secondaryString.length(); y++){

                String strr1 = Character.toString(secondaryString.charAt(y));
                //To eliminate duplicates, exit loop if you find the first occurance
                if(strr.equals(strr1)){
                    System.out.print(primaryString.charAt(x)+sep);
                    y += secondaryString.length()-1;
                }
            }

        }

    }
}

