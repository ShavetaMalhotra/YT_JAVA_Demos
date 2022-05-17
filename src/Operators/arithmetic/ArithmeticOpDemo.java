package operators.Arithmetic;

/*
/ - divide-----Quotient
% - modulus----Remainder
 */
public class ArithmeticOpDemo {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 2;
        int sum = number1 + number2;
        int mul = number1 * number2;
        int sub = number1 - number2;
        int div = number1 / number2; //10/2--->5 Q --Ans
        int mod = number1 % number2; //10%2 =0

        System.out.println(sum);//10 + 2 =12
        System.out.println(mul);//20
        System.out.println(sub);//8
        System.out.println(div);//5
        System.out.println(mod);//0

    }
}
