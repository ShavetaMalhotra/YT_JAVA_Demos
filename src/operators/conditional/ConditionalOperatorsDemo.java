package operators.conditional;
/*
<,>,<=,>=,==,!=
 */
public class ConditionalOperatorsDemo {
    public static void main(String[] args) {
      int a=90;
      int b=100;
      int c=89;

        System.out.println(a<b);//90 <100--true
        System.out.println(a>b);//90>100--false


        System.out.println(a<=c); //a<c---90<89--false or a==c---false---false

        System.out.println(a>=c);//true or false ----true

        System.out.println(a==c);//false

        System.out.println(a!=c);// 90 !=89--true

    }
}
