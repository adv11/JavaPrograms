package CP;
import java.util.*;

public class String_in_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();
//        for(int i=0 ; i<str.length() ; i++){
//            System.out.println(str.charAt(i));
//        }

        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str.toUpperCase(Locale.ROOT));
        System.out.println(str.chars());
        System.out.println(str.compareTo("Akash"));
        System.out.println(str.concat("Deep"));
        System.out.println(str.split(" "));
    }
}
