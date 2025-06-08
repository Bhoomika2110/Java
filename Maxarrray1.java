
import java.util.Scanner;

public class Maxarrray1 {
   

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the size of the array: ");
      int var2 = var1.nextInt();
      int[] var3 = new int[var2];
      System.out.println("Enter " + var2 + " integers:");

      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var3[var4] = var1.nextInt();
      }

      var4 = Integer.MIN_VALUE;
      int[] var5 = var3;
      int var6 = var3.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = var5[var7];
         if (var8 > var4) {
            var4 = var8;
         }
      }

      System.out.println("The maximum value in the array is: " + var4);
   }
}
