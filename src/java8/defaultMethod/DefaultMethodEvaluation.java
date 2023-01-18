package java8.defaultMethod;

public class DefaultMethodEvaluation implements DemoInterfaceTwo, DemoInterfaceOne {

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void loggerOne() {
        //while adding some more implementation with parent interface impl
        DemoInterfaceOne.super.loggerOne();
        System.out.println("adding some more log info...");
    }

    @Override
    public void loggerTwo() {
        //while using your own implementation!
        System.out.println("adding fresh log info...");
    }

    @Override
    public void defaultMethod() {
        //while conflict
        DemoInterfaceTwo.super.defaultMethod();
        DemoInterfaceOne.super.defaultMethod();
    }

    public static void main(String[] args) {
        //while no conflict
        new DefaultMethodEvaluation().loggerOne();
        new DefaultMethodEvaluation().loggerTwo();

        new DefaultMethodEvaluation().defaultMethod();
    }
}
