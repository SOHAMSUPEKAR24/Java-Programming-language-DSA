import java.util.*;
public class sumfun{
    public static void calculatesum(int num1 , int num2){
          int c = num1 +num2;
        System.out.print(c);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    calculatesum(a,b);
    }

}