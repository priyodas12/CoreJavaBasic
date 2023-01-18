package java8.staticMethod;

public class StaticMethodImpl implements DemoInterfaceStOne,DemoInterfaceStTwo{

    public static void main(String[] args) {
        DemoInterfaceStOne.stMethod();
        DemoInterfaceStTwo.stMethod();
    }
}
