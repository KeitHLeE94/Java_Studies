package com.ssafy.algo;

import java.util.*;

public class Main534 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        String result = "";

        if(word.equals("A")){
            result = "Excellent";
        }
        else if(word.equals("B")){
            result = "Good";
        }
        else if(word.equals("C")){
            result = "Usually";
        }
        else if(word.equals("D")){
            result = "Effort";
        }
        else if(word.equals("F")){
            result = "Failure";
        }
        else{
            result = "error";
        }

        System.out.println(result);
    }

}
