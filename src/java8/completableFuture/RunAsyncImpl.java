package java8.completableFuture;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class RunAsyncImpl {

    public static void main(String[] args) {
        System.out.println("main:Execution started by "+Thread.currentThread().getName());
        //runAsync takes a supplier
        CompletableFuture.runAsync(()->generateSomeNumber());
        sleepSomeTime(4000);
        System.out.println("main:Execution finished by "+Thread.currentThread().getName());
    }


    public static int generateSomeNumber(){
        sleepSomeTime(3000);
        System.out.println("generateSomeNumber:Executed by "+Thread.currentThread().getName());
        return new Random().nextInt();
    }


    public static void sleepSomeTime(int times) {
        try {
            Thread.sleep(times);
            System.out.println("sleepSomeTime:Executed by "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
