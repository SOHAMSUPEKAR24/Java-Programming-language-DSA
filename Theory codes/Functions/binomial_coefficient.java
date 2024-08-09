
import java.util.*;
public class binomial_coefficient{
    public static int factorial(int n){
        int f = 1;
        if(n <0){
            System.out.print("Factorial doesnt exist for negative numbers");
        }
        else{
        for(int i = 1; i <= n ; i++){
            f = f * i;
        }
        }
        return f;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre n: ");
        int n = sc.nextInt();
        System.out.print("Entre r : ");
        int r = sc.nextInt();
        int first = factorial(n);
        int second = factorial(r);
        int third = factorial(n-r);
        int last = first /(second * third);
        System.out.print("Binomial coefficient is : " + last);
    }

}