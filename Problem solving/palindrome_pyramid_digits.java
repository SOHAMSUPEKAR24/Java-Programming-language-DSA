public class palindrome_pyramid_digits {
    public static void main(String[] args) {
        int n = 5; 
        for (int line = 1; line<= n; line++) {
            // Print leading spaces
            for (int col = line; col < n; col++) {
                System.out.print("_");
            }
             // Print the left half of the palindrome
            for (int col = 1; col <= line; col++) {
                System.out.print(col);
            }
             // Print the right half of the palindrome
            for (int col = line - 1; col >= 1; col--) {
                System.out.print(col);
            }
            // Move to the next line
            System.out.println();
        }
    }
}
