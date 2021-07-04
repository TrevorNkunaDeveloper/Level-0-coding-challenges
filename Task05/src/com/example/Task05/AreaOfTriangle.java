package com.example.Task05;

public class AreaOfTriangle {
    public static void main(String[] args){

        int Length1 = 5;
        int Length2 = 3;
        int Length3 = 4;

        System.out.println(computeArea(Length1,Length2,Length3));
    }
    static double computeArea(int length1,int length2,int length3){

        double semiPerimeter = (double) 1/2*(length1 + length2 + length3);

        double area = (double) Math.sqrt(semiPerimeter*(semiPerimeter - length1)*(semiPerimeter - length2)*(semiPerimeter -length3));

        return area;
    }

}
