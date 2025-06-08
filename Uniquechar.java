import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Uniquechar {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.print("enter your String");
        String userStr = input.next();


        for (char ch : userStr.toCharArray()) {
            unique.add(ch);
            
        }
        System.out.printf("your String has has %d unique character",unique.size());
    }
}
