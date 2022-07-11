package oopsConcepts.variables;
/* Variables in oops concepts
Instance Variable /properties/fields
1. Known as : object level variables / global variables--------------------1
2. Declaration : declared inside the class and outside the method
3. initialisation: no need to initialise instance variable,JVM assign the values to these variables according to
their data type. for eg: int -0, boolean- false, double -0.0, String/any class - null
4. Accessibility:
in static method - can be accessible with the help of class object but can't access it directly
in non-static method - can access directly within same class
5. value of instance variables varies as we create different no of objects of a class---------------imp2
6. Why known as object Level varibales - intialisation and M/m  allocation happens at the time of object
creation---imp3

 */
public class InstanceVariable{

    int i=10;//0
    float f;//0.0f
    double d;//0.0
    String st;// null

    //non-static method
    public void nonStaticMethod(){
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        st = "Test";
        System.out.println(st);
    }

    public static void main(String[] args) {
        //create an object of class
        InstanceVariable obj1 = new InstanceVariable();
        InstanceVariable obj2 = new InstanceVariable();
        InstanceVariable obj3 = new InstanceVariable();
        obj1.i=900;
        System.out.println(obj1.i);//i=10
        System.out.println(obj2.i);//i=10
        System.out.println(obj3.i);//i=10


//        System.out.println(obj.i);
//        System.out.println(obj.f);
//        System.out.println(obj.d);
//        obj.st = "Test";
//        System.out.println(obj.st);

    }

}
