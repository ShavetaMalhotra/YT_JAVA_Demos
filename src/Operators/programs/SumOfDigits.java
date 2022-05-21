package operators.programs;

import java.sql.SQLOutput;

public class SumOfDigits {
    public static void main(String[] args) {
        int x = 111; //12
        int d1,d2,d3 =0 ;
        d1 = x%10;
        System.out.println("Value of digit1 is - "+ d1);//5
        x = x/10; // 14

        //for 2nd digit:
        d2 = x%10;
        System.out.println("Value of digit2 is - "+ d2);//4

        d3 =x/10; //1
        System.out.println("Value of digit3 is - "+ d3);//1

        int sum = d1+d2+d3;
        System.out.println("Sum of digits of a number is - "+ sum);//10

    }
}
