package java9.stream;

import java.util.stream.Stream;

public class OfNullableImpl {
    /*The ofNullable(T) method returns a sequential Stream containing a single element
    if this stream is non-null otherwise method returns an empty Stream. It helps to handle
    the null stream and NullPointerException.*/
    public static void main(String[] args) {
        //Create a stream with null
        Stream<String> value
                = Stream.ofNullable(null);

        // Print values
        System.out.println("Values of Stream:");
        value.forEach(System.out::println);
    }
}
