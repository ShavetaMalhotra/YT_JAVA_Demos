package operators;

public class PrintingStatements {
    public static void main(String[] args) {
        int a =10;

        System.out.println("a"); //value of a is 10
        System.out.println(a);

        System.out.println("Value of a is- " + a);
        System.out.println(a + " Value of a");

        int b = 10;
        //int c = a + b;  //10+10

        //System.out.println("Sum of a and b is - "+ c);

        System.out.println("Sum of a and b is - "+ a + b); //Sum of a and b is - 1010
        System.out.println("Sum of a and b is - "+ (a + b));

        System.out.println(a+b+" Sum of a and b ");//10+10=20  Sum of a and b


        int m = 10;
        int n=20;
        System.out.println("Sum of " + m + " and " + n + " is - "+ (m+n) ); //sum of 10 and 20 is - 30
    }
}
