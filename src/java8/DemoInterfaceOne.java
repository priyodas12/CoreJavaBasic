package java8;

public interface DemoInterfaceOne {

    public void m1();

    default void loggerOne(){
        System.out.println("Logging DemoInterfaceOne info");
    }

    default void defaultMethod(){
        System.out.println("DemoInterfaceOne:defaultMethod");
    }
}
