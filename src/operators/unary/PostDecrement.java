package operators.unary;

public class PostDecrement {
    public static void main(String[] args) {
        int x =15;

        System.out.println(x--);//15-->14, m/m store
        System.out.println(x);//14

        x--; //13
        x--;//12
        x--;//11

        System.out.println(x); //11
        //11---->10-->9

        int z = x-- + --x + x ; //11 + 9 + 9 = 29
        System.out.println(z); //29
        System.out.println(x); //9


    }
}
