import java.util.Scanner;

public class Maxarray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
         
        int[] arr = new int[size];
       System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
      int max = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
     System.out.println("The maximum value in the array is: " + max);
    }
}
