import java.util. Scanner;
public class Absoluteternary {
    public static void main(String[] args) {
        Scanner scanner= new Scanner( System.in);
    System.out.println("welcome to absoulte value");
    System.out.println(" please enter you number ");
    int num=scanner.nextInt();
    int result = num >=0 ?num : -num;
    System.out.println("absolute value is "+ result);
    }
}
