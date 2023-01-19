package java8.completableFuture;

import java.util.concurrent.CompletableFuture;

public class ConditionalCompletableFuture {

    public static void main(String[] args) {
        CompletableFuture<Integer> completableFuture=new CompletableFuture<>();

        int value=7;

        CompletableFuture<Void> voidCompletableFuture = executeThatProcess(completableFuture);

        completableFuture.complete(value);
    }

    public static CompletableFuture<Void> executeThisProcess(CompletableFuture<Integer> completableFuture){
        return completableFuture.thenApply(i->i*102)
                .thenApply(i->i%5)
                .thenAccept(i-> System.out.println(Thread.currentThread().getName()+" executes "+i));
    }

    public static CompletableFuture<Void> executeThatProcess(CompletableFuture<Integer> completableFuture){
        return completableFuture.thenApply(i->i*100)
                .thenApply(i->i%12)
                .thenAccept(i-> System.out.println(Thread.currentThread().getName()+" executes "+i));
    }
}
