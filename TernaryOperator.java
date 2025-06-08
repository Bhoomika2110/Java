import java .util.Scanner;

public class TernaryOperator {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("welcome to number checker");
    System.out.println("please enter number");
    int num1 =  input.nextInt();
    System.out.println("enter 2 number");
    int num2 = input.nextInt();



int greaterNumber = num1 >num2 ? num1:num2;
    System.out.println(greaterNumber+ " is the greater number");
}
}