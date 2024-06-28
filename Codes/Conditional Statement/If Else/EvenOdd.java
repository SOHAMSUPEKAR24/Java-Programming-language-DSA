
import java.util.Scanner;

public class EvenOdd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre a Number: ");
        int a = sc.nextInt();
        // int a = 30;
        if( a % 2 == 0){
            System.out.print("Entered number is even : ");
            System.out.print( a );
        }
        else{
            System.out.print("Entered number is odd :");
            System.out.print(a);
        }

    }
} 