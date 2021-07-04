package com.example.Task07;

public class Temperature {
    public static void main(String[] args){
        
    }
    public static double convertToFahrenheit(double tempCelcius){
       double tempFarenheit = (tempCelcius * 1.8) + 32;
       return  tempFarenheit;
    }
    public static  double convertToCelcius(double tempFarenheit){
        double tempCelcius = (tempFarenheit - 32)*((double)5/9);
        return tempCelcius;

    }

}
