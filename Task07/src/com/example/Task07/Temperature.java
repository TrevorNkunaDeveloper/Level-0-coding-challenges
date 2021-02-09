package com.example.Task07;

public class Temperature {
    public static void main(String[] args){
    }
    public static double convert_to_Fahrenheit(double temperature_C){
       double temperature_F = (temperature_C * 1.8) + 32;
       return  temperature_F;
    }
    public static  double convert_to_Celcius(double temperature_F){
        double temperature_C = (temperature_F - 32)*((double)5/9);
        return temperature_C;

    }

}
