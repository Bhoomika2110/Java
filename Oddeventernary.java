import java.util.Scanner;

public class Oddeventernary {
    public static void main(String[] args) {
        Scanner scanner= new Scanner ( System.in);
    System.out.println("welcome to odd/even ternary\n");
    System.out.println(" please enter you number ");
    int num=scanner.nextInt();
    String result = num % 2 == 0 ? "Even ":"Odd";
    System.out.println("your number is"+ result);
    }
}
