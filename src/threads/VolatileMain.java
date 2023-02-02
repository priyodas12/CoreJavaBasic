package threads;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class VolatileMain {
    public static void main(String[] args) {
        SingletonWithVolatile s1=SingletonWithVolatile.getSingletonInstance();

        SingletonWithVolatile s2=SingletonWithVolatile.getSingletonInstance();
        System.out.println(LocalDateTime.now());

        try {
            TimeUnit.MILLISECONDS.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(LocalDateTime.now());
        SingletonWithVolatile s3=SingletonWithVolatile.getSingletonInstance();

        System.out.println(s1.equals(s3));
        final SingletonWithVolatile[] s4 = new SingletonWithVolatile[1];
        final SingletonWithVolatile[] s5= new SingletonWithVolatile[1];
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                s4[0] =SingletonWithVolatile.getSingletonInstance();
                System.out.println(s4[0]);
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                s5[0] =SingletonWithVolatile.getSingletonInstance();
            }
        });

        t1.start();
        t2.start();

        System.out.println(s4[0].equals(s1));
    }
}
