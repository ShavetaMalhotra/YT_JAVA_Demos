package operators.logical;

/*
Logical operators - AND- && , OR -|| , NOT- !

AND (&&)--both the c ondistions should be true
userId>0     password>0      result(AND)     result (OR)
true         true             true           true
false       true              false          true
true        false             false          true
false       false            false             false


username or email
 */
public class LogicalOperatorDemo {
    public static void main(String[] args) {

        int userId   = 454546;//>0
        int password = 1234;//>0

        //System.out.println( (userId>0) && (password>0) );

        //OR
        System.out.println( (userId>0) || (password>0) );//true || false ----true

        //NOT
        System.out.println( !(userId>0)); // !(true) ==false
    }
}
