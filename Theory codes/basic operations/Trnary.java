public class Trnary{
    public static void main(String args []) {
        
        int a = 30 ;
     String type = ((a%2) == 0) ? "even" : "odd";
        System.out.println(type);
        int marks = 67;
        String RC = marks >= 33 ? "PASS" : "FAIL";
        System.out.println(RC);

    }
}