public class Character_printing_in_half_pyramid{
    public static void main(String[] args) {
        // character printing in half pyramid style
        char ch ='A';
        for(int line = 1; line<=4;line++){
            //for loop for no of lines getting print
            for(int alpha=1 ; alpha<=line ; alpha++){
                //inner loop of printing chracter
                System.out.print(ch);
                ch++;
                //here in c++ character value is getting increased by 1 so we can get next character  

            }
            System.out.println();
        }
    }
}