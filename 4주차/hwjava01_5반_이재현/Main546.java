package com.ssafy.algo;

import java.util.*;

public class Main546 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        double sum = 0;

        for(int i=0; i<count; i++){
            int score = sc.nextInt();
            sum += score;
        }

        double average = sum / count;

        System.out.println("avg: " + average);
        String judge = (average >= 80) ? "pass" : "fail";
        System.out.println(judge);

    }

}
