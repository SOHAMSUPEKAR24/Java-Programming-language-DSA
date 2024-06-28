public class reverse_digit{
    public static void main(String[] args) {
        int rev = 0;
        for(int num = 242005; num >0 ; num/=10){
            int lastdigit = num % 10;
            rev = (rev * 10) + lastdigit;
        }
        System.out.println(rev);

    }
}