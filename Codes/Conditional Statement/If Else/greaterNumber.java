import java.util.*;
public class greaterNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre First number : ");
        int a = sc.nextInt();
        System.out.print("Entre Second number : ");
        int b = sc.nextInt();
        if(a > b) {
            System.out.print("First number " + a + " is greatre than second " + b);
        }
        if ( a == b){
            System.out.print("Entered Number are same");
        }
        else {
            System.out.print("Second number " +  b  + " is greatre than " +  a);
        }


    }
} 