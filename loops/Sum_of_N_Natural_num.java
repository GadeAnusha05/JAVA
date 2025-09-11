package loops;
import java.util.*;


public class Sum_of_N_Natural_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        Integer N = sc.nextInt();
        double Sum = N*((N+1)/2);
        System.out.println("the sum of n natural numbers"+Sum);
    }

    
}
//using loops
int n=4;
int sum1=0;
for (int i=0;i<=n;i++){
    sum=i+sum;
}
    system.out.println(sum);
}
