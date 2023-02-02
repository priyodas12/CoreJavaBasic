package threads;

import java.time.LocalDateTime;

public class SingletonWithVolatile {

    private static volatile SingletonWithVolatile instance;

    private SingletonWithVolatile(){
        System.out.println("Singleton Instance Created at:: "+ LocalDateTime.now());
    }

    public static SingletonWithVolatile getSingletonInstance(){
        if(instance==null){
            synchronized (SingletonWithVolatile.class){
                if(instance==null){
                    instance=new SingletonWithVolatile();
                }
            }
        }
        return instance;
    }
}
