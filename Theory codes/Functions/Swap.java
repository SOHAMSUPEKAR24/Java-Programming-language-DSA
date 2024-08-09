
public class Swap{
    public static void swap(int num1 , int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.print("a:-" + num1);
        System.out.print("b:-" + num2);
    }
    public static void main(String args[]){
        int a = 20;
        int b = 10;
        swap(a,b);
    }
}