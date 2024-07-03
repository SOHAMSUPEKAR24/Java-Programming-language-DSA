public class inverted_star_pattern{
    public static void main (String args[]){
        //inverted star pattern or inverted right angled triangle pattern
        int n = 4;
        //n is no of lines to be printed
        for(int i = 1; i<= 4;i++){
            //for loop for lines
            for(int star = 1; star<=(n-i)+1;star++){
                //for loop for printing * (n- i + 1) formula
                System.out.print("*");

            }
            System.out.println();
        }
    }
}