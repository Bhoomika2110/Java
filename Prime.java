import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);

        if (isPrime) {
            System.out.println("Your number is prime.");
        } else {
            System.out.println("Your number is not prime.");
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Check divisibility up to the square root of num
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // Found a divisor, so not prime
            }
        }

        return true; // No divisors found, so it's prime
    }
}
