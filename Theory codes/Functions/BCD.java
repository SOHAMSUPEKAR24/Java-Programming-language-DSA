import java.util.*;
//Function of binary to decimal
public class BCD{
    public static void BintoDec(int BinNum){
        int pow = 0;
        int decNum= 0;
        while(BinNum >0){
            int lastdigit = BinNum % 10;
            decNum = decNum + (lastdigit *(int)Math.pow(2,pow));

            pow++;
            BinNum = BinNum / 10;
        }
        System.out.println(decNum);
    }
    //Function of Decimal to binary
    public static void DectoBin(int n){
        int pow = 0;
        int BinNum = 0;
        while(n > 0){
            int rem = n %2 ;
            BinNum = BinNum +(rem *(int)Math.pow(10,pow));
            pow++;
            n = n/2;

        }
        System.out.println(BinNum);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Binary to Decimal conversion
        System.out.println("Entre Binary digit: ");
        int digit = sc.nextInt();
        BintoDec(digit);


        // Decimal to binary conversion  
        System.out.println("Entre Decimal number: ");
        int digi = sc.nextInt();
        DectoBin(digi);



    }
}