package com.ssafy.algo;

import java.util.*;

public class Main543 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num != 1) {
            if(num % 2 == 1){
                num--;
            }

            for(int i=2; i<=num; i+=2){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

}
