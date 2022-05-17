package operators.Exercises.Ex1_UnaryOp;

public class Que3 {
    public static void main(String[] args) {

        //3. what will be value of a,b and c?
        int a=5;
        int b=6;
        int c = a++ + ++a + ++b +b + ++b;
        System.out.println(a); //7
        System.out.println(b); //8
        System.out.println(c); //34
    }
}
