import java.util.Scanner;

public class Passwordchecker {
public static void main(String[] args) {
      Scanner scanner= new Scanner ( System.in);
    System.out.println("welcome to set your password");
    boolean isValid;
    String password;
   
    do{
        System.out.println("please enter your password ");
         password = scanner.next();  
      } 
      while(  ! isValidPassword(password));
    System.out.println(" thanks for entering valid password ");

}
 public static boolean isValidPassword(String password){
    return password.length() > 4;
}
    
}