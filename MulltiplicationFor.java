import java.util.Scanner;

public class MulltiplicationFor {
public static void main(String[] args) {
       Scanner scanner= new Scanner ( System.in);
    System.out.println("welcome to printing table  \n");
    System.out.println(" please enter you number ");
    int num = scanner.nextInt();
    for (int i= 1; i<=10; i++ ){
        System.out.println(num +  " x " +i+" = "+(num*i));
    }
} }
