package com.ssafy.algo;

import java.util.*;

public class Main531 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double weight = sc.nextDouble();
        String grade;

        if(weight <= 50.80){
            grade = "Flyweight";
        }
        else if(weight <= 61.23){
            grade = "Lightweight";
        }
        else if(weight <= 72.57){
            grade = "Middleweight";
        }
        else if(weight <= 88.45){
            grade = "Cruiserweight";
        }
        else{
            grade = "Heavyweight";
        }

        System.out.println(grade);
    }

}
