package operators.unary;

/* unary - single variable
PreIncrement / pre decrement------ > ++variable / --variable ---increase value by 1
postIncrement /post decrement------>variable++ / variable------decrease the value by 1
* */
public class PreIncrementOP {
    public static void main(String[] args) {
//        int a=10;
//        System.out.println(a); //10
//        System.out.println(++a); //11

        int c = 15;
        int b = ++c; //c=16,m/m stores c=16, assign the updated value to b variable

        System.out.println(b); //16
        System.out.println(c); //16

        //c=16
        int d = ++c;//c=17,d=17
        System.out.println(d);//17
        System.out.println(c);//17

        int x = 1; //2
        int y = 2; //3
        int z = ++x + ++y + x + y; // 2 + 3 + 2 + 3 = 10
        System.out.println(z);

        //////////////////////////////////////////////////////////////////
        int m =10;
        int n = 10;

        m++; //11--->12
        ++n;//11----->12

        int j = m++ + ++n + m; // 11 + 12 + 12 = 35
        System.out.println(j);//35
        System.out.println(m);//12
        System.out.println(n);//12

    }
}
