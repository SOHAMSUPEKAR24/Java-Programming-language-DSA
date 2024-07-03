import java.util.*;
public class TAXbill{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre Cost of a Pencile :");
        float a = sc.nextFloat();
        System.out.print("Entre cost of a pen :");
        float b = sc.nextFloat();
        System.out.print("Entre cost of eraser :");
        float c = sc.nextFloat();
        float sum = (a + b + c)+((a + b + c) * 0.18f) ;
        System.out.print("total bill with tax is :");
        System.out.print(sum);

    }
}