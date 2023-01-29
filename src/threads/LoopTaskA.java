package threads;

import java.util.concurrent.TimeUnit;

public class LoopTaskA implements Runnable{
    private static int count=0;
    private int id;
    @Override
    public void run() {
        System.out.println("#######"+Thread.currentThread().getName()+"#######");
        for(int i=0;i<10;i++){
            System.out.println("<Thread Id: "+Thread.currentThread().getName()+",prints "+i);
            try {
                TimeUnit.MILLISECONDS.sleep((long) (Math.random()*1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("#######"+Thread.currentThread().getName()+"#######");
    }

    public LoopTaskA() {
        this.id = ++count;
    }
}
