package Conditional_Statements;
import java.util.*;


public class If {
    public static void  main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age:");
        Integer age=sc.nextInt();
        if (age>=18){
            System.out.println("youre eligible to vote");

        }

        else{
            System.out.println("youre not eligible vote");
        }
        


    }
    
}
