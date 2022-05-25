package ControlStatements;

import java.util.Scanner;

/*
if(expression/cond.){
}else if(cond/expr.){
}else if(cond/expr.){
}else{
}
 */
public class ladderElseIf {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        System.out.println("Please enter a day number between 1-7");
        int daysOfWeek = scn.nextInt(); //2,5,7

//3
        if(daysOfWeek==1){ //3==1
            System.out.println("Day is Sunday");
        }else if(daysOfWeek==2){ //3==2
            System.out.println("Day is Monday");
        }else if(daysOfWeek==3){ //3==3
            System.out.println("Day is Tue");
        }else if(daysOfWeek==4){
            System.out.println("Day is Wed");
        }else if(daysOfWeek==5){
            System.out.println("Day is thur");
        }else if(daysOfWeek==3){
            System.out.println("Day is Fri");
        }else if(daysOfWeek==7){
            System.out.println("Day is Sat");
        }else{
            System.out.println("Number should be between 1-7");
        }




    }
}
