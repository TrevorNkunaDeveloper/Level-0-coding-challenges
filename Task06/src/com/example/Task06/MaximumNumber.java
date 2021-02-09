package com.example.Task06;

public class MaximumNumber {
    public static void main(String[] args){

        int num1 = 3;
        int num2 = 4;
        int num3 = 100;

        System.out.println(maximum(num1,num2,num3));
    }
    static int maximum(int value1,int value2, int value3){
        int max=0;

        if(value1 > value2 && value1 > value3){
            max = value1;
        }
        else if(value2 > value1 && value2 > value3){
            max = value2;
        }
        else {
            max = value3;
        }
        return max;
    }

}
