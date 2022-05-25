package ControlStatements.programs;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        System.out.println("Please enter a number ");
        int number = scn.nextInt();

        if(number>0){
            System.out.println("Number is greater than zero");//2
        }else if(number<0){
            System.out.println("Number is less than zero");//3
        }else{
            System.out.println("Number is equal to zero");//1
        }




    }
}
