import java.util.*;
public class FUNhollow_rectangle{
    public static void Hollrec(int row,int col){
        for(int i = 1; i<=row ;i++){
            for(int j = 1; j<=col; j++){
                if(i == 1 || i == row || j == 1 || j == col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
         System.out.println();
        }
       
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre row: ");
        int a = sc.nextInt();
        System.out.println("Entre column: ");
        int b = sc.nextInt();
        Hollrec(a,b);
    }
}