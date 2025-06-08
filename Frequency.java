import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 45, 5);
        
        System.out.println(Collections.frequency(numbersList, 1)); 
        System.out.println(Collections.frequency(numbersList, 7));
        System.out.println(Collections.frequency(numbersList, 8)); 
    }
}
