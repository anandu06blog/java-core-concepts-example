package CollectorsExampleTeeing;

import java.util.*;
import java.util.stream.*;

public class CollectorsTeeingRunner {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Example of teeing collector
        Result result = numbers.stream()
                .collect(Collectors.teeing(
                        Collectors.summingInt(Integer::intValue), // downstream1: sum
                        Collectors.maxBy(Integer::compare),      // downstream2: max
                        (sum, max) -> new Result(sum, max.get()) // merger: combine sum and max
                ));
Collections.synchronizedList(numbers).stream().peek(System.out::println).toList();
        System.out.println("Sum: " + result.getSum());
        System.out.println("Max: " + result.getMax());
    }

    static class Result {
        private final int sum;
        private final int max;

        public Result(int sum, int max) {
            this.sum = sum;
            this.max = max;
        }

        public int getSum() {
            return sum;
        }

        public int getMax() {
            return max;
        }
    }
}
