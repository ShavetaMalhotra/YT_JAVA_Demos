package operators;

import java.util.Scanner;

/*
Syntax to Create an object of class:
 */
public class UserInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a byte type number");
        byte b = scn.nextByte();

        System.out.println("Enter a short type number");
        short s = scn.nextShort();

        System.out.println("Enter a long type number");
        long l = scn.nextLong();

        System.out.println("Enter a float type number");
        float f = scn.nextFloat();


        System.out.println("Enter a double type number");
        double d = scn.nextDouble();

        System.out.println("Enter a boolean type number");
        boolean bool = scn.nextBoolean();

        System.out.println("Enter a string type number");
        String str = scn.next();

        System.out.println("Enter a character type number");
        char ch = scn.next().charAt(0);


    }
}
