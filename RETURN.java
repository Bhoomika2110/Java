import java.util.Scanner;

public class RETURN{
public static void main(String[] args) { 
greet();
int first = readnumber();
int second = readnumber();

int result= first+second;
System.out.println("sum of number "+ result);}

public static int readnumber(){ 
    Scanner input = new Scanner( System.in);
    System.out.println("enter 1 number");
     int num  = input.nextInt();
     return num;
}
public static void greet() {
    System.out.println("welcome to calculator");
  }  
}
        

      

    
