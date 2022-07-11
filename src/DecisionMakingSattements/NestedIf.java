package DecisionMakingSattements;
/*
if(cond1){
   if(cond2){
   }else{
   }
}else{
    if(){
    }else{
   }
}
 */
public class NestedIf {
    public static void main(String[] args) {

        if(false){//true
            System.out.println("Main if part.....");//1
            if(false){
                System.out.println("Main if part.....inner if");//2
            }else{
                System.out.println("Main if part.....inner else part");// else part
            }

        }else{
            System.out.println("Main else part.....");//1
            if(false){
                System.out.println("Main else part.....inner if");//2
            }else{
                System.out.println("Main else part.....inner else part");//3
            }
        }



    }
}
