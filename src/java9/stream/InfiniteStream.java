package java9.stream;

import java.time.LocalDate;
import java.util.stream.Stream;

public class InfiniteStream {
    public static void main(String[] args) {
        Stream.iterate(0,n->n+1)
                .limit(10)
                .forEach(System.out::println);

        LocalDate today=LocalDate.now();
        Stream.iterate(today,date->date.plusDays(1))
                .limit(10)
                .forEach(System.out::println);
    }

}
