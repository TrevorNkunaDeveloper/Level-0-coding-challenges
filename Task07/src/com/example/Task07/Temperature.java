package com.example.Task07;

public class Temperature {
    public static void main(String[] args){
        
    }
    public static double convert_to_Fahrenheit(double tempCelcius){
       double tempFarenheit = (tempCelcius * 1.8) + 32;
       return  tempFarenheit;
    }
    public static  double convert_to_Celcius(double tempFarenheit){
        double tempCelcius = (tempFarenheit - 32)*((double)5/9);
        return tempCelcius;

    }

}
