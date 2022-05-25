package ControlStatements;
/*
switch( variable_val){
case val1 :
        Statement1;
        break;
case val2 :
        Statement1;
        break;
default:
        Statement

}
 */
public class SwitchStatement {
    public static void main(String[] args) {
        int dayNumber = 2;

        switch(dayNumber){
            case 1:
                System.out.println("Sun");
                break;
            case 2:
                System.out.println("Mon");//1

            case 3:
                System.out.println("Tue");

            case 4:
                System.out.println("Wed");

            case 5:
                System.out.println("Thur");
                break;
            case 6:
                System.out.println("Fri");
                break;
            case 7:
                System.out.println("Sat");
                break;
            default:
                System.out.println("Wrong Day!");
        }

        System.out.println("Out of Switch case....");

    }
}
