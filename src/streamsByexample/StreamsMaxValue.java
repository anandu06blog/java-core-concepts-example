package streamsByexample;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamsMaxValue {
    public static void main(String[] args) {
        Stream<String> findMaxValueofInteger = Stream.of("1","2","3","4","5","6","7787","7","878",
                "78","7","87","8","78","78","78");
        System.out.println(
    findMaxValueofInteger.mapToInt(Integer::parseInt).max().getAsInt());

    }

}
