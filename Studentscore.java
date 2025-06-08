import java.util. Scanner;
public class Studentscore {
    public static void main(String[] args) {
        Scanner scanner= new Scanner ( System.in);
        System.out.println("welcome to student score");
        System.out.println(" please enter your marks ");
        int marks =scanner.nextInt();
        String category =  marks >80 ? "high" :(marks > 50 ? " moderate":"low");
        System.out.println("your category"+ category);
    } 
}
