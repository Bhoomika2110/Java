import java.util.Scanner;

public class Printeven1 {
 

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();

      for(int var3 = 1; var3 <= var2; ++var3) {
         if (var3 % 2 != 0) {
            System.out.println(var3);
         }
      }

   }
}

