import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     System.out.println("enter your day in number: ");
     int day =input.nextInt();
     newSwitch(day);
     
     /*switch (day) {
        case 1:
            System.out.println("monday");
            break;
        case 2:
        System.out.println("tuseday");
        break;
        case 3:
        System.out.println("wednesday");
        break;
        case 4:
        System.out.println("thursday");
        break;
    
        default:
        System.out.println("invaild day");
            break;
      }*/
    }
    public static void newSwitch(int day) {
        String dayStr = switch (day) {
            case 1 ->"monday"; 
            case 2 ->"tuseday"; 
            case 3 ->"wednesday"; 
            case 4 ->"thursday"; 
            case 5 ->"friday"; 
            case 6 ->"saturday"; 
            case 7 ->"sunday"; 
            default ->"invald day"; 
               
        };
        System.out.println(dayStr);
    }
}
