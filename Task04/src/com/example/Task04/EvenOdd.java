package com.example.Task04;

public class EvenOdd {
    public static void main(String[] args){
        int number = 51;
        even_or_odd(number);
    }
    static void even_or_odd(int value){
        if(value % 2 == 0){
            System.out.println("even");
        }
        else if(value % 2 != 0){
            System.out.println("odd");
        }
    }
}
