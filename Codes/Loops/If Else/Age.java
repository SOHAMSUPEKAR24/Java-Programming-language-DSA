
import java.util.Scanner;

class Age{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre Age: ");
        int a = sc.nextInt();
        if ( a >= 18){
            System.out.print("Adult");
        }
        else if(a <= 13){
            System.out.print("Child");
        } 
        else{
            System.out.print("Teenager");
        }
        // System.out.print("Teenager");


    }
} 