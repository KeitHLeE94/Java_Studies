package com.ssafy.algo;

import java.util.*;

public class Main545 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[10];

        for(int i=0; i<10; i++){
            int temp = sc.nextInt();
            numbers[i] = temp;
        }

        int threeCount = 0;
        int fiveCount = 0;

        for(int i=0; i<10; i++){
            if(numbers[i] % 3 == 0){
                threeCount++;
            }
            if(numbers[i] % 5 == 0){
                fiveCount++;
            }
        }

        System.out.println("Multiples of 3: " + threeCount);
        System.out.println("Multiples of 5: " + fiveCount);
    }

}
