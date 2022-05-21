package operators.unary;

public class PostIncrement {
    public static void main(String[] args) {
        int a=2;
        System.out.println(a++); //2
        System.out.println(a);//3

        int b = a;
        System.out.println(b);//3

        int c = b++; // 1. assign to variable c, 2. will increment the value of b by 1
        System.out.println(c); //3
        System.out.println(b); //4

        System.out.println("--------------------------------------------------------------");
        //a = 3-->4, b= 4-->5, c= 3
        // Pre /post
        int z = a++ + ++b + c ; // 3 + 5  + 3 ==11

        //values of variables in m/m ---> a=4, b=5,c=3
        System.out.println(a);//4
        System.out.println(b);//5
        System.out.println(c);//3
        System.out.println(z);//11
    }
}
