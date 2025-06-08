import java.util.Scanner;

public class PrimeClass{
  

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int var2 = var1.nextInt();
      boolean var3 = isPrime(var2);
      if (var3) {
         System.out.println("Your number is prime.");
      } else {
         System.out.println("Your number is not prime.");
      }

   }

   public static boolean isPrime(int var0) {
      if (var0 <= 1) {
         return false;
      } else {
         for(int var1 = 2; var1 * var1 <= var0; ++var1) {
            if (var0 % var1 == 0) {
               return false;
            }
         }

         return true;
      }
   }
}

