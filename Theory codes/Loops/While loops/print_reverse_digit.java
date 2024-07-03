public class print_reverse_digit{
    public static void main(String[] args) {
        int num = 242005;
        while(num>0){
           int lastdigit = num % 10;
            System.out.print(lastdigit);
            num = num / 10 ;
        }
    }
}