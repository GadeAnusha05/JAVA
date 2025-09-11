package Input;
import java.util.*;

public class Basic{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("enter your name:");

        String name1 =sc.next();
        System.out.println("Enter your name 2");

        Integer age =sc.nextInt();
        System.out.println("enter your age");

        System.out.println("hello this is "+name+ "my full name is"+name1+"my age is"+age);

        sc.close();

    }
}
