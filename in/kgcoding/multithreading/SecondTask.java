package in.kgcoding.multithreading;

public class SecondTask extends Thread {
    @Override 
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.printf("%d #",i);
        }
        System.out.println("\n # task Complete");
    }
}
