package com.ssafy.algo;

public class Main548 {

    public static void main(String[] args){
        for(int i=2; i<=4; i++){
            for(int j=1; j<=5; j++){
                if(i * j < 10){
                    System.out.print(i + " * " + j + " =  " + i * j + "   ");
                }
                else{
                    System.out.print(i + " * " + j + " = " + i * j + "   ");
                }
            }
            System.out.println();
        }

    }

}
