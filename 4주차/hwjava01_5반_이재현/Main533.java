package com.ssafy.algo;

import java.util.*;

public class Main533 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String sex = sc.next();
        int age = sc.nextInt();

        String result = "";

        if(sex.equals("M") && age >= 18){
            result = "MAN";
        }
        else if(sex.equals("M") && age < 18){
            result = "BOY";
        }
        else if(sex.equals("F") && age >= 18){
            result = "WOMAN";
        }
        else if(sex.equals("F") && age < 18){
            result = "GIRL";
        }

        System.out.println(result);
    }

}
