package in.kgcoding.collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList{
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Bhoomika");    
            strList.add("gupta");

         if(strList.contains("gupta")){
            System.out.println(strList.indexOf("gupta"));
         }

        for(int i=0; i<strList.size();i++){
        System.out.print(strList.get(i));}
    }
}
