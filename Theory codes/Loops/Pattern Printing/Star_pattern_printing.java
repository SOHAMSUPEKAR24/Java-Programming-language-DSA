public class Star_pattern_printing{
    public static void main(String args[]){
        //Star Pattern Printing 
        //nested for loop
        for(int i = 1 ; i <= 3; i++ ){ 
            // this for loop is for line change
            for(int star = 1; star <=i ; star++){  
                // this for loop is for printing patterns
                System.out.print("*");
            }
            System.out.println();
        }


    }
}