import java.util.Scanner;

public class Circle1 {
   double radiusInMm;

   Circle1(double var1) {
      this.radiusInMm = var1;
   }

   double getCircumference() {
      return 2.0 * this.radiusInMm * Math.PI;
   }

   double getArea() {
      return Math.PI * Math.pow(this.radiusInMm, 2.0);
   }

   public String toString() {
      double var10000 = this.radiusInMm;
      return "Circle properties: Radius in mm " + var10000 + ", Circumference in mm: " + this.getCircumference() + ", Area in mm\u00b2: " + this.getArea();
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the radius (in mm):");
      double var2 = var1.nextDouble();
      Circle var4 = new Circle(var2);
      System.out.println(var4);
   }
}

