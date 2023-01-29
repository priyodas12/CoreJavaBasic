package java8.lambdaExpression;

public class ThreadImpl {
    public static void main(String[] args) {
     /* Thread th=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New Thread: "+Thread.currentThread().getName());
            }
        });*/

        Thread th;
       th= new Thread(() -> {
            System.out.println("New Thread: "+Thread.currentThread().getName());
        });
        th.start();

        System.out.println(Thread.currentThread().getName());


    }
}
/*
E:\Learning Path\intellij-workspace\CoreJavaBasic\src\java8\lambdaExpression>javap -c ThreadImpl.class
Compiled from "ThreadImpl.java"
public class java8.lambdaExpression.ThreadImpl {
  public java8.lambdaExpression.ThreadImpl();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: new           #7                  // class java/lang/Thread
       3: dup
       4: invokedynamic #9,  0              // InvokeDynamic #0:run:()Ljava/lang/Runnable;
       9: invokespecial #13                 // Method java/lang/Thread."<init>":(Ljava/lang/Runnable;)V
      12: astore_1
      13: aload_1
      14: invokevirtual #16                 // Method java/lang/Thread.start:()V
      17: getstatic     #19                 // Field java/lang/System.out:Ljava/io/PrintStream;
      20: invokestatic  #25                 // Method java/lang/Thread.currentThread:()Ljava/lang/Thread;
      23: invokevirtual #29                 // Method java/lang/Thread.getName:()Ljava/lang/String;
      26: invokevirtual #33                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      29: return
}*/
