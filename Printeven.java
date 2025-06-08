import java.util.Scanner;

public class Printeven {
    public static void main(String[] args) {
Scanner input= new Scanner(System.in);

        int num = input.nextInt();
    int i;
        for( i = 1 ;i <= num ; i++ ){
            if( i % 2 == 0){
                continue;
            }
        System.out.println(i);
    }

    }
}
