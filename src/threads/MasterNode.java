package threads;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class MasterNode {
    public static void main(String[] args) {

/*        WorkerNode1 n1=new WorkerNode1();
        WorkerNode2 n2=new WorkerNode2();

        long startTime=System.nanoTime();
        try {
            n1.executeTask();
        } catch (InterruptedException e) {
            throw new RuntimeException(e+"from WorkerNode1");
        }
        try {
            n2.executeTask();
        } catch (InterruptedException e) {
            throw new RuntimeException(e+"from WorkerNode2");
        }
        long endTime=System.nanoTime();
        System.out.println("TotalTime Taken:  "+(endTime-startTime)/1000000000);*/

        ParallelWorkerNode1 pn1=new ParallelWorkerNode1();
        ParallelWorkerNode2 pn2=new ParallelWorkerNode2();

        long startTime=System.nanoTime();
        System.out.println(Thread.currentThread().getName()+">>"+startTime);
        pn1.start();
        pn2.start();

        try {
            pn1.join();
            pn2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long endTime=System.nanoTime();
        System.out.println(Thread.currentThread().getName()+">>"+endTime);
        System.out.println("TotalTime Taken:  "+(endTime-startTime)/1000000000);

    }
}

class WorkerNode1{
    public void executeTask() throws InterruptedException {
        for (int i = 0; i <10 ; i++) {
            TimeUnit.MILLISECONDS.sleep(100);
            System.out.println(this.getClass()+" executing task number"+i);
        }
    }
}
class WorkerNode2{

    public void executeTask() throws InterruptedException {
        for (int i = 0; i <10 ; i++) {
            TimeUnit.MILLISECONDS.sleep(100);
            System.out.println(this.getClass()+" executing task number"+i);
        }
    }
}

class ParallelWorkerNode1 extends Thread{

    public ParallelWorkerNode1() {
        System.out.println("ParallelWorkerNode1:: "+Thread.currentThread().getState());
    }

    @Override
    public void run() {
        System.out.println("ParallelWorkerNode1:: "+Thread.currentThread().getState());
        for (int i = 0; i <10 ; i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.getClass()+" executing task number"+i);
        }
    }


}

class ParallelWorkerNode2 extends Thread{

    public ParallelWorkerNode2() {
        System.out.println("ParallelWorkerNode2:: "+Thread.currentThread().getState());
    }
    @Override
    public void run() {
        System.out.println("ParallelWorkerNode2:: "+Thread.currentThread().getState());
        for (int i = 0; i <10 ; i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.getClass()+" executing task number"+i);
        }
    }
}