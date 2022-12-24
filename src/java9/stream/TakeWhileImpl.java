package java9.stream;

import java.util.List;
import java.util.stream.Stream;

public class TakeWhileImpl {
    // create a stream of names
    public static void main(String[] args) {


        Stream<String> stream1
                = Stream.of("aman", "amar", "suraj",
                "jakjs", "ashjkja","amza");

        Stream<String> stream2
                = Stream.of("aman", "amar", "suraj",
                "jakjs", "ashjkja","amza");

        // apply takeWhile to take all the names
        // matches passed predicate
        List<String> list1
                = stream1.takeWhile(name -> (name.charAt(0) == 'a')).toList();

        List<String> list2
                = stream2.filter(name -> (name.charAt(0) == 'a')).toList();

        System.out.println(list1);
        System.out.println(list2);

        // [aman, amar]
        //[aman, amar, ashjkja, amza]

    }
}
