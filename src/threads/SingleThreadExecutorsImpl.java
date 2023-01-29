package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorsImpl {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" starts");
        ExecutorService exe= Executors.newSingleThreadExecutor();
        for(int j=0;j<10;j++){
            exe.execute(new LoopTaskA());
        }
        exe.shutdown();
        System.out.println(Thread.currentThread().getName()+" ends");
    }
}
