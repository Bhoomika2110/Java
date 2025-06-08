
import java.lang.*;
import java.util.Scanner;

public class Primerfor {
    public static void main(String[] args) {
          Scanner scanner= new Scanner ( System.in);
        System.out.println("welcome to prime number checker");
       System.out.println(" please enter number: ");
       int num = scanner.nextInt();
       boolean isprime = isprime(num);
       System.out.println(" your number is " +(isprime(num) ? "prime": "not prime") );
    }
    public static boolean isprime(int num){
        for ( int i= 2; i<num ; i++){
            if (num % i== 0){
                return false ;
            }
        }
        return true;
    }
}

