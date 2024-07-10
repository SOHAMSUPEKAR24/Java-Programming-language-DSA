public class hollow_square_pattern{
    public static void main(String[] args) {
        int n= 10;
        //diamentations of square (n x n) 
        for(int row = 1; row <= n ; row++){
            //for loop for rows 
            for(int col = 1; col <= n ; col++){
                //for loop for coloumns
                if( col == 1 || col == n|| row == 1|| row == n){
                    //if loop for condtion where should star printed 
                    System.out.print("*");
                    
                }
                else{
                    //else loop for space printing where there are no stars
                    System.out.print(" ");
                }
            }
            // s.out for next line
            System.out.println();
 
        }
    }
}