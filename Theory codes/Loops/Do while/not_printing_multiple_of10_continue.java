import java.util.*;
public class not_printing_multiple_of10_continue{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        do { 
            System.out.print("Entre number : ");
            int a = sc.nextInt();
            if( a % 10 == 0){
                continue;
            }
            System.out.println(a);
        } while (true);
    }
}