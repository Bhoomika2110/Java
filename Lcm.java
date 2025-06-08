 import java .util .Scanner; 
 
 public class Lcm {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter number; ");
        int first= input.nextInt();
        System.out.println("enter number; ");
        int second = input.nextInt();
        int lcm = lcm( first,second) ;
        System.out.println("LCM of the number is "+ lcm);

} public static int lcm( int first ,int second){
    int i=1;
    while( true){
        int factor= first * i;
        if ( factor% second== 0){
            return factor ;
        
        }i++;
    }
}
}