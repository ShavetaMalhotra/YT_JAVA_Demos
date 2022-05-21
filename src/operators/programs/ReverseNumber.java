package operators.programs;
/*
567 ---> 765
 */
public class ReverseNumber {
    public static void main(String[] args) {
        int number = 567;//56
        int rev=0;
        int rem = 0;

        //get first digit
        rem = number % 10 ;
        System.out.println("Remainder is -"+ rem);

        rev = rev * 10 + rem; //0*10+ 7 =7
        System.out.println("Reverse of a number is -"+ rev);

        //scnd digit
        number = number /10;//56
        System.out.println("Number  is -"+ number);//

        rem = number % 10; //6
        System.out.println("Remainder is -"+ rem);
        rev = rev * 10 + rem;
        System.out.println("Reverse of a number is -"+ rev);//76

        //last digit
        rem = number / 10 ; //5

        rev = rev * 10 + rem;//76 * 10 + 5 = 765

        System.out.println("reverse of anumber is -"+ rev);


    }
}
