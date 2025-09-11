package Conditional_Statements;
import java.util.*;


public class else_if {

    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the marks obtained:");
        Integer marks=sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 75) {
            System.out.println("Grade: A");
        } else if (marks >= 50) {
            System.out.println("Grade: B");
        } 
        else {
            System.out.println("Grade: Fail");


        }

    
}
