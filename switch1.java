
import java.util.Scanner;

public class switch1 {
 

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("enter your day in number: ");
      int var2 = var1.nextInt();
      newSwitch(var2);
   }

   public static void newSwitch(int var0) {
      String var10000;
      switch (var0) {
         case 1:
            var10000 = "monday";
            break;
         case 2:
            var10000 = "tuseday";
            break;
         case 3:
            var10000 = "wednesday";
            break;
         case 4:
            var10000 = "thursday";
            break;
         case 5:
            var10000 = "friday";
            break;
         case 6:
            var10000 = "saturday";
            break;
         case 7:
            var10000 = "sunday";
            break;
         default:
            var10000 = "invald day";
      }

      String var1 = var10000;
      System.out.println(var1);
   }
}

