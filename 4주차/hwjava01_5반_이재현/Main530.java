package com.ssafy.algo;

import java.util.*;

public class Main530 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        System.out.println(age);
        String message = (age >= 20) ? "adult" : (20 - age) + " years later";

        System.out.println(message);
    }

}
