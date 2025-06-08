package in.kgcoding.map;

import java.util.HashMap;
import java.util.Map;

public class TestingMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Prasant", 34);  
        map.put("Sanchit", 36);  
        map.put("Bhoomika", 20);
        map.put("Ram", 25);      
        System.out.println(map.size()); 
        System.out.println(map.get("Bhoomika")); 
        System.out.println(map.containsKey("Mohan"));
        

        for(String key: map.keySet()){
            System.out.printf("%s : %s\n", key , map.get(key));
        }

    }
}
