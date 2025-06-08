import java.util.Scanner;

public class MinimumTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter your first number: ");
            int num1 = input.nextInt();
            System.out.println("Enter your second number: ");
            int num2 = input.nextInt();
            
            MinimumTernary ternary = new MinimumTernary();
            int min = ternary.min(num1, num2);
            System.out.println("Minimum number is: " + min);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } finally {
            input.close(); 
        }
    } 

    public int min(int num1, int num2) { 
        return num1 < num2 ? num1 : num2;
    }
}
