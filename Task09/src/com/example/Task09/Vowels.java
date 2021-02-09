package com.example.Task09;

public class Vowels {
    public static void main(String[] args) {
    }

        public static void print_out_vowels(String text){
        char[] stringText = text.toLowerCase().toCharArray();

        for(int x = 0; x < stringText.length; x++){
            if(stringText[x] == 'a' || stringText[x] == 'e' || stringText[x] =='i' || stringText[x] == 'o' || stringText[x] == 'u'){
                System.out.println(stringText[x]);
            }
        }
    }
}
