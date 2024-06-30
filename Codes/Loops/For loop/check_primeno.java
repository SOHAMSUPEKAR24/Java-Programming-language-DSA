import java.util.*;
public class check_primeno{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Entre number : ");
        int a = sc.nextInt();
        for(int i = 2 ; i <= a; i++){
            if(a % i == 0){
                
                System.out.print("Entred number is not prime");
                break;
            }
            else{
                System.out.print("Entered number is prime");
                break;
            }
        }
    }
}