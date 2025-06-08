
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Map<String , String> countryMap = new  HashMap<>();
        countryMap.put("Bharat", "newDelhi");     
           countryMap.put("China", "Beijing");
           countryMap.put("Pakistan", "islambad");
           countryMap.put("Shrilanka", "Columbo");
           countryMap.put("Bangladesh", "Dhaka");
         
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the country name");
            String country =input.next();
            if(countryMap.containsKey(country)){
                System.out.printf("Capital is %s is %s",country,countryMap.get(country));
            }else{
                System.out.println("Sorry");
            }

    }
}
