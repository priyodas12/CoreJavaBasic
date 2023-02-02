package threads;

import java.util.concurrent.TimeUnit;

public class DeadlockExample {

    final static String R1 = "Netflix";
    final static String R2 = "Prime Video";

    public static void main(String[] args)
    {
        // creating thread T1
        // implementing run method
        Thread T1 = new Thread(() -> {

            // thread T1 locking the R1 resource
            synchronized (R1){
                System.out.println("Thread T1 locked -> Resource: "+R1);
                try {
                    TimeUnit.MILLISECONDS.sleep(1000);
                    System.out.println("Thread T1 is processing...");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                // thread T1 locking the R2 resource
                synchronized (R2){
                    System.out.println("Thread T1 locked -> Resource: "+R2);
                    for (int i = 0; i <5 ; i++) {
                        System.out.println(i+Thread.currentThread().getName());
                    }
                }
            }
        });

        // creating thread T2
        // implementing run method
        Thread T2 = new Thread(() -> {

            // thread T2 locking the R2 resource
            synchronized (R2){
                System.out.println("Thread T2 locked -> Resource: "+R2);

                // thread T2 locking the R1 resource
                synchronized (R1){
                    System.out.println("Thread T1 locked -> Resource: "+R1);
                    for (int i = 0; i <5 ; i++) {
                        System.out.println(i+Thread.currentThread().getName());
                    }
                }
            }
        });

        // starting both the threads
        T1.start();
        T2.start();
    }
}
