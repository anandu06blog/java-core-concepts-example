package streamsByexample;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class creatingStreamByExample {
    public static void main(String[] args) {

//        genenrateStreamByofMethod();
//        genenrateStreamByconcatMethod();
//        generateemptyStream();
//
//        generateStreamBygenerate();
        generateStreamByIterate();
    }

    private static void generateStreamByIterate() {
        Stream<Integer> inStream = Stream.iterate(1, i -> i * 2);
        inStream.limit(10).forEach(System.out::println);
    }

    private static void generateStreamBygenerate() {
    Stream<Number> numberSequence = Stream.generate(()->new Random().nextInt(100));
    numberSequence.limit(50).forEach(System.out::println);
    }

    private static void generateemptyStream() {
        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(System.out::println);
    }

    private static void genenrateStreamByconcatMethod() {
        Stream<String> streamOfMethod1 = Stream.of("4","5","45","89");

        Stream<String> streamOfMethod2 = Stream.of("4","5","45","90","78");
        Stream<String> concatStream = Stream.concat(streamOfMethod1, streamOfMethod2);
        concatStream.toList().forEach(System.out::println);

    }

    private static void genenrateStreamByofMethod() {

                Stream<String> streamOfMethod = Stream.of("4","5","45");
                streamOfMethod.forEach(System.out::println);
    }
}
