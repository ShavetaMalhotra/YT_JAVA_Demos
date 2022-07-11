package DecisionMakingSattements;
/*
Selection/Decision Making Statements
Loop/ Iteration Statements
Branching/ Transfer Statements

Selection/Decision Making Statements:
1. if statement
2. if-else statement
3. ladder else if
4. switch case

 */
public class DecisionMakingStatements {
    public static void main(String[] args) {
        if(true){
            System.out.println("if part...");
        }

        int a=10;

        if(a>0){ //false
            System.out.println("Value of a is 0");
        }

        a= 100;
        if(a<0) {
            System.out.println("Value of a is smaller than 0");
            System.out.println("this is not a prt of if statement");
        }

    }
}
