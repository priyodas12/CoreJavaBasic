package java8.completableFuture;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class SupplyAsyncChain {

    public static void main(String[] args) {
        System.out.println("main:Execution started by "+Thread.currentThread().getName());

        CompletableFuture.supplyAsync(()->generateSomeNumber())
                .thenApply(integer -> integer%2==0?integer+2:integer*5)
                .thenApply(integer -> integer*3)
                .thenAccept((i)-> System.out.println(i+" Execution finished by "+Thread.currentThread().getName()));

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
