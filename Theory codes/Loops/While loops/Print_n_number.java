import java.util.*;
public class Print_n_number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int start = 1;
        System.out.println("Entre n : ");
        int n = sc.nextInt();
        while( start <= n){
            System.out.println(start);
            start++;
        }
    }
}