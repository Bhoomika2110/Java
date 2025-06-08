import java.util.Scanner;

public class Calculatorswitch {
    public static void main(String[] args) {
         Scanner input =new Scanner(System.in);
        System.out.println("enter your number ");
        int num1 = input.nextInt();
        System.out.println("enter your number ");
        int num2= input.nextInt();
         System.out.println("now enter the operation");
         String operation = input.next();
         int result = switch (operation){
            case "+" -> num1+num2;
            case "-" -> num1-num2;
            case "*" -> num1*num2;
            case "/" -> num1/num2;
            default -> 0;
         };
         System.out.println("your answer is "+ result);
     } 
  
}
