public class continue_statement_skipping_no_3{
    public static void main(String args[]) {
        for(int i = 1 ; i <=5 ;i++){
            
            if(i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}