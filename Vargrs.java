
public class Vargrs {
public static void main(String[] args) {
    System.out.println(concatenate("prashant"));

    System.out.println(concatenate("prasant","jain"));

    System.out.println(concatenate("Subscribe","to", "Channel"));


}

    public static String concatenate(String...strs){
            StringBuilder sb=new StringBuilder();

            for (String str : strs) {
                sb.append(str).append(" ");
                
                
            } return sb.toString();

        
    }
}
