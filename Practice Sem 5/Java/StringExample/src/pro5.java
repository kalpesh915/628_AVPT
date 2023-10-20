public class pro5 {
    public static void main(String[] args) {
        String s1 = "Meet"; 
        String s2 = "Meet";
        String s3 = "Harmeet";
        String s4 = new String("Meet");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));
        System.out.println(s1 == s2);
        System.out.println(s1 == s4);
    }
}
