public class half_pyramid_digits{
    public static void main(String args[]){
        int n = 4;
        int number = 1;
        for(int row = 1; row <= n ; row++){
            for(int col = 1; col <= n ; col ++){
                if(col<=row){
                    System.out.print(number);
                    number++;
            
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    }
}