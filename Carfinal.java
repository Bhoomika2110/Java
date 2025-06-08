 
 import java.lang.*;
 
 public class Carfinal {
     final int noOfWheels;
     final String model;
     final String engineInliter;


   public Carfinal( int noOfWheels, String model, String engineInliter){
    this.noOfWheels = noOfWheels;
    this.model= model;
    this.engineInliter = engineInliter;
   }
    

   public static void main(String[] args) {
       Carfinal c = new Carfinal(2, "hello", "hello");
       System.out.println(c); 
   }
}
