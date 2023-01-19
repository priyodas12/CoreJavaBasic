package java8.completableFuture;

import java.util.Random;

public class MainThreadWaitingPrincipal {
    /* here all process executed by main thread
    sleepSomeTime:Executed by main
    generateSomeNumber:Executed by main
    -1083469110 printed by main
    */

    public static void main(String[] args) {
        int num=generateSomeNumber();
        System.out.println(num+" printed by "+Thread.currentThread().getName());
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
