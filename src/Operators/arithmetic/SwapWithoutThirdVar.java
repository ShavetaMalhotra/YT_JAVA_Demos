package operators.Arithmetic;

/**
 * o/p - number1 = 10, number2 = 7
 */
public class SwapWithoutThirdVar {
    public static void main(String[] args) {

        int number1 = 90;
        int number2 = 1000;

        number1 = number1 + number2; //17
        number2 = number1 -number2; //17 -10 = 7
        number1 = number1 - number2; //17 - 7 =10
        System.out.println(number1); //17
        System.out.println("value of number2 is -"+number2);//7
        System.out.println("value of number1 after swapping  is -"+number1); //17





    }
}
