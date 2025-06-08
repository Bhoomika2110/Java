package in.kgcoding.challenge100;

public class Threadstate extends Thread {

    @Override
    public void run() {
        try {
            System.out.printf("Thread state before sleep: %s%n",
             getState());
            Thread.sleep(4000); 
            System.out.printf("Thread state after sleep: %s%n",
             getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
