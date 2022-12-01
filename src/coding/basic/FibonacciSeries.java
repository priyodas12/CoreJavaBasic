package coding.basic;

public class FibonacciSeries {

    public static void main(String[] args) {
        printFibonacci(10);
    }

    public static void printFibonacci(int n) {
        var a = 0;
        var b = 1;
        var c = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + ", ");

            a = b;
            b = c;
            c = a + b;
        }
    }
}
