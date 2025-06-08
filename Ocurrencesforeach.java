import java.util.Scanner;

public class Ocurrencesforeach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int element = scanner.nextInt();
          
        int occurrences = 0;
          for (int num : arr) {
            if (num == element) {
                occurrences++;
            }
        }

        System.out.println("The element " + element + " occurs " + occurrences + " times in the array.");
    }
}
