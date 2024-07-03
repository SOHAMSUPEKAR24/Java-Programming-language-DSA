class strings{
    public static void main(String[] args) {
        String s = "Soham";
        System.out.println(s.charAt(1));
        char a = s.charAt(3);
        System.out.println(a);
        s+=" Supekar";
        System.out.println(s);
        s = "Hello "+s;
        System.out.println(s);
        s = s.substring(5);
        System.out.println(s);
    }
}