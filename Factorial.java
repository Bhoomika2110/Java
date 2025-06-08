import java.util. Scanner;

public class  Factorial{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter number; ");
        int num = input.nextInt();
        int sum= sumofdigit(num);
        System.out.println("sum of digits is;"+ sum);
 

}  public static int sumofdigit(int num){ 
    int sum =0;
    while (num>0) 
    {sum +=num %10;
     num /=10;
    } 
    return sum ;


}
    
}
