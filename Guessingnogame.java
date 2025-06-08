import java.util.Scanner ;

public class Guessingnogame {
    public static void main(String[] args) {
        Scanner scanner= new Scanner ( System.in);
        int num =5 , guess ;
    System.out.println("welcome to number game");
    
    do{
        System.out.println(" please enter you number between 0 to 10 ");
         guess = scanner.nextInt();
     }    while(num != guess);
     System.out.println("you have succesfuly guess the number ");
    }
}
