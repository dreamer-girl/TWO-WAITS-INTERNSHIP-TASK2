import java.util.*;
 
class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int n = sc.nextInt();
        int i=1,fact=1;
 for(i=1;i<=n;i++) 
 {            
 fact=fact*i;      
 }
 System.out.println("Factorial of "+n+" = "+fact);
    }
}
