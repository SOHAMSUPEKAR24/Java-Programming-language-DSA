public class Half_pyramid_of_digits{
    public static void main(String[] args) {
        //Half pyramid of digits from 1 to 4
        for(int line = 1; line<=4 ; line++){
            //for loop for no of lines getting print
            for(int number = 1; number<=line;number++){
                //for loop for printing numbers line wise
                System.out.print(number);
            }
            System.out.println();
        }
    }
}