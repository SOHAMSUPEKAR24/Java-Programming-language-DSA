import java.util.*;
public class Printing_num_tilll_multiple_of10{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.print("Entre Number : ");
            int n = sc.nextInt();
                        System.out.println(n);
                        if(n % 10 == 0){
                            System.out.println("Multiple of 10 ");
                            break;
                        }
        } while (true);
    }
}