package in.kgcoding.challenge100;

public class Main {
    public static void main(String[] args) {
        Threadstate t1 = new Threadstate();

        
        System.out.printf(" Create Thread state start: %s \n", t1.getState());

        t1.start();  

        try {
            t1.join();  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        System.out.printf("Thread finished: %s", t1.getState());
    }
}
