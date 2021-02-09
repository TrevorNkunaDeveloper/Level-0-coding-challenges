package com.example.Task08;

public class Time {
    public static void main(String[] args){
        int num = 62;
        convert_time(num);

    }

    static void convert_time(int number){

        String hoursText, minutesText;
        int hours = number / 60;
        int minutes = number - (hours*60);

        if(hours != 1){
            hoursText ="hours";
        }else {
            hoursText ="hour";
        }
        if(minutes != 1){
            minutesText = "minutes";
        }else{
            minutesText = "minute";
        }

        System.out.println(hours+" "+hoursText+","+minutes+" "+minutesText+".");

    }
}
