import java.util.Scanner;

public class Palindromstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the string to be checked;");
        String str = input.next();
        System.out.println("your string is "+((ispalindrom(str)? "Palindrom": " Not palindrom")));
    } 
        public static boolean ispalindrom(String str){
        if (str.length() <= 1){
            return true ;
        }  
        
        int lastpos = str.length()-1;
        
        if ( str.charAt(0) != str.charAt(lastpos)){
            return false;
        } 
         String newstr = str.substring(1, lastpos);
        return ispalindrom(newstr);
        
    }
}
