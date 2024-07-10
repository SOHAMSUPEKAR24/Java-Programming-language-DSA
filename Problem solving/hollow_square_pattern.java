public class hollow_square_pattern{
    public static void main(String[] args) {
        int n= 4;
        for(int row = 1; row <= n ; row++){
            for(int col = 1; col <= n ; col++){
                if( col == 1 || col == n|| row == 1|| row == n){
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
 
        }
    }
}