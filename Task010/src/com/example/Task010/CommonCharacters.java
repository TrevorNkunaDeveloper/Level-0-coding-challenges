package com.example.Task010;
import java.util.Locale;
import java.util.Scanner;

public class CommonCharacters {
    public static void main(String[] args){

        check_for_common_chars("house","computers");

    }
    static void check_for_common_chars(String input1,String input2){
        String firstString = input1.toLowerCase();
        String secondString = input2.toLowerCase();
        String primaryString, secondaryString;
        String sep =", ";
        System.out.print("Common letters: ");
        if(firstString.length() > secondString.length()){
            primaryString = firstString;
            secondaryString = secondString;
        }
        else{
            primaryString = secondString;
            secondaryString = firstString;
        }
        for(int x = 0; x < primaryString.length();x++){
            if(x == primaryString.length()-1)
            {
                sep ="";
            }
            for (int y = 0 ; y < secondaryString.length(); y++){
                if(primaryString.charAt(x) == secondaryString.charAt(y)){
                    System.out.print(primaryString.charAt(x)+sep);
                }
            }
        }


    }
}

