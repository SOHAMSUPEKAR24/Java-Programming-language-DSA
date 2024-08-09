public class multiply{
    public static int multi(int a , int b){
        int product = a * b;
        return product;
    }
    public static void main (String args []){
        int a = 10;
        int b = 20;
        int product = multi(a,b);
        System.out.println(product);
        product = multi(200,300);
        System.out.println(product);
    }
}