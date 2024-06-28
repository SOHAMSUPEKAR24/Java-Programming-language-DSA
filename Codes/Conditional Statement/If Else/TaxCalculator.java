import java.util.*;
public class TaxCalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre Income in lakhs : ");
        int a = sc.nextInt();
        if( a < 500000){
            System.out.print("No tax on income : " + a);
        }
        else if( a <= 1000000){
            System.out.println("20% tax on income : " + a);
            int tax = (int) (a - (a * 0.2));
            System.out.println("Income after tax reduction is : " + tax);
            int tax1 = a - tax ;
            System.out.println("Tax on amount is :" + tax1);
        }
        else{
            System.out.println(" 30% tax on income : " +  a);
            int income = (int) (a * 0.3) ;
            int total = a - income ;
            System.out.println("total tax is : " + income );
            System.out.println("Total income after tax reduction is : " + total);

        }

    }
} 