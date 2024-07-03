import java.util.*;
public class add_n_natural_num{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre range : ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        
        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println(sum);
    } 
}