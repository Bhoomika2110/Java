import java.util.Scanner;

public class GuessingGame {
int random;

    GuessingGame() {
        random =(int) Math.ceil(Math.random() *100) ;
    }

int guess(int number){
return  number - random;
}

    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        GuessingGame game =new GuessingGame();
        System.out.println("welcome to guessing game, guess the number between 1to 10");
        int result;
        do { 
            System.out.println("guess the number");
            int number = input.nextInt();
            result = game.guess(number);
          if (result == 0) {
              System.out.println("Congrats,your guess is right");
          
            }  else if (result <0){
                System.out.println("please guess the higher number");
            } else {
                System.out.println(" please guess the lower number");
            }
        } while (result !=0);
    }
}