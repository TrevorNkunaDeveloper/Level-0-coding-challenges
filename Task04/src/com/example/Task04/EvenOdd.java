package com.example.Task04;

public class EvenOdd {
    public static void main(String[] args){
        int number = 52;
        even_or_odd(number);
    }
    static void even_or_odd(int value){
        String word = "";
        if(value % 2 == 0){
            word = "even";
        }
        else if(value % 2 != 0){
            word = "odd";
        }
        System.out.println(word);
    }
}
