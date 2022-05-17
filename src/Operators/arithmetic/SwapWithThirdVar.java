package operators.Arithmetic;

/**
 *  o/p - number1 = 20, number2 = 10
 */
public class SwapWithThirdVar {
    public static void main(String[] args) {

         int number1 = 10;
        int number2 = 20;

        System.out.println("values of number1 and number2 before swapping:");
        System.out.println("Value of number2 is - "+number2);//10
        System.out.println("Value of number1 is - "+number1);//20
        int temp = 0;

        temp = number2; //temp=20
        number2 = number1; //number2 = 10
        number1 = temp;//number1 =20


        System.out.println("values of number1 and number2 after swapping:");
         System.out.println("Value of number2 is - "+number2);//10
        System.out.println("Value of number1 is - "+number1);//20
        //System.out.println(temp);//20

    }
}
