import java.util.*;
public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "\nabc def ";
        System.out.println(s.charAt(2));
        System.out.println(s.length());
        System.out.println(s.substring(2,6));
        System.out.println(s.trim());
        System.out.println(s.length());
        System.out.println(s.contains("def"));
    }
}
