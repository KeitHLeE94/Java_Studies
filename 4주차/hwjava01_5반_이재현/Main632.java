package com.ssafy.algo;

import java.util.*;

public class Main632 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int min = (num1 < num2) ? num1 : num2;
        min = (min < num3) ? min : num3;

        System.out.println(min);

    }

}
