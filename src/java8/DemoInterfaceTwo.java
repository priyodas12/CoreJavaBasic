package java8;

public interface DemoInterfaceTwo {
    public void m2();

    default void loggerTwo(){
        System.out.println("Logging DemoInterfaceTwo info");
    }

    default void defaultMethod(){
        System.out.println("DemoInterfaceTwo:defaultMethod");
    }
}
