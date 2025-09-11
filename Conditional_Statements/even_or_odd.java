package Conditional_Statements;
import java.util.*;


public class even_or_odd {
    public static void main (String [] args){

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number :");
        Integer num = sc.nextInt();
        if (num%2==0){
            System.out.println("its an even number:");
        }

        else{
            System.out.println("its not an even number:");
            
        }


    }
    
}
