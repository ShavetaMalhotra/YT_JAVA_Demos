package oopsConcepts.variables;
/* Variables in oops concepts
Static Variable -  /properties of an object /fields
1. Known as : Class level variables / global variables---1
2. Declaration : declared inside the class and outside the method with static keyword
3. initialisation: no need to initialise static variable,JVM assign the values to these variables according to
their data type. for eg: int -0, boolean- false, double -0.0, String/any class - null
4. Accessibility:
in static method - can be accessible directly within same class
in non-static method - can access directly within same class
5. value of static variables doesn't varies as we create different no of objects of a class-5
6. Why known as class Level variables - initialisation and M/m  allocation happens at the time of class loading (
.class)-2
7. No need to create an object of class-3
8. Static members always share the memory-4
static variables always stores into static M/m .
 */
public class StaticVariable {
    static int i;//0
    static boolean b; //false
    static String st; //null

    public void nonStaticMethod(){
        System.out.println(i);
        System.out.println(b);
        System.out.println(st);
    }
    public static void main(String[] args) {
//        i=100;
//        System.out.println(i);
//        b=true;
//        System.out.println(b);
//        st="testing";
//        System.out.println(st);
        StaticVariable sv1 =  new StaticVariable();
        StaticVariable sv2 =  new StaticVariable();
        StaticVariable sv3 =  new StaticVariable();
        sv1.i=200;
        System.out.println(sv1.i);
        sv2.i=400;
        System.out.println(sv2.i);
        System.out.println(sv3.i);
        System.out.println(sv1.i);

    }

}
