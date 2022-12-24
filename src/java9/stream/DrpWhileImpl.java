package java9.stream;

import java.util.List;
import java.util.stream.Stream;

public class DrpWhileImpl {
    public static void main(String[] args) {


        Stream<String> stream1
                = Stream.of("aman", "amar","asjs", "suraj",
                "jakjs", "ahasj", "qwwo");

        // apply takeWhile to take all the names
        // matches passed predicate
        List<String> list1
                = stream1.dropWhile(name -> (name.charAt(0) == 'a')).toList();

        System.out.println(list1);

    //[suraj, jakjs, ahasj, qwwo]
    }
}
