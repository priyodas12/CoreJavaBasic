package threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExecutorsImpl {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" starts");
        ExecutorService exe=Executors.newFixedThreadPool(8);
        exe.submit(new LoopTaskA());
        exe.shutdown();
        System.out.println(Thread.currentThread().getName()+" ends");
    }
}

