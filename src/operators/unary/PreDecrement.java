package operators.unary;

public class PreDecrement {
    public static void main(String[] args) {
        int a=5;
        System.out.println(--a);//4--m/m store---->4


        int b = --a; //3, store into m/m, assign to b var
        System.out.println(b);//3
        System.out.println(a);//3

        //b=2-->1
        int c = --b + --b + b; // 2 + 1 + 1 =4
        System.out.println(b);//1
        System.out.println(c);//4

        int d = 10;
        --d;//9
        --d;//8
        --d;//7

        System.out.println(d);//7

    }

}
