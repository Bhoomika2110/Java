
import java.util.Scanner;

public class P{
  

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("welcome to prime number checker");
      System.out.println(" please enter number: ");
      int var2 = var1.nextInt();
      boolean var3 = isprime(var2);
      System.out.println(" your number is " + (isprime(var2) ? "prime" : "not prime"));
   }

   public static boolean isprime(int var0) {
      for(int var1 = 2; var1 < var0; ++var1) {
         if (var0 % var1 == 0) {
            return false;
         }
      }

      return true;
   }
}

