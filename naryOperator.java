
import java.util.Scanner;

public class naryOperator {
 

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("welcome to number checker");
      System.out.println("please enter number");
      int var2 = var1.nextInt();
      System.out.println("enter 2 number");
      int var3 = var1.nextInt();
      int var4 = var2 > var3 ? var2 : var3;
      System.out.println("" + var4 + " is the greater number");
   }
}

