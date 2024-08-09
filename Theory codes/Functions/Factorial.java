
import java.util.*;
public class Factorial{
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
        System.out.print("Entre number for factorial : ");
        int n = sc.nextInt();
        int fac = factorial(n);
        System.out.print(fac);
    }

}