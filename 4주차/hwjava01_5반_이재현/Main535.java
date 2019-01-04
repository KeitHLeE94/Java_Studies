package com.ssafy.algo;

import java.util.*;

public class Main535 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double score = sc.nextDouble();

        String result = "";

        switch ((int)score){
            case 4:
                result = "scholarship";
                break;
            case 3:
                result = "next semester";
                break;
            case 2:
                result = "seasonal semester";
                break;
            default:
                result = "retake";
                break;
        }

        System.out.println(result);

    }

}
