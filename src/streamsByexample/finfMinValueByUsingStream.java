package streamsByexample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class finfMinValueByUsingStream {
    public static void main(String[] args) {

        findMinValueByusingStreamof();
        findminvalueByusingArrayList();
        findminvalueByusingHashmap();
        findminvalueByusingSet();
    }

    private static void findMinValueByusingStreamof() {
        Stream<Integer> findminvalue = Stream.of(45,45,4,54,54,5,45,45345345,435,43,543654645,645645,645,645,6,456,45,645);
        System.out.println(findminvalue.min(Integer::compareTo).get());
    }

    private static void findminvalueByusingArrayList() {
        List<String> numbersasString = new ArrayList<>();
        numbersasString.add("45");
        numbersasString.add("45");
        numbersasString.add("45d");numbersasString.add("45");numbersasString.add("45");numbersasString.add("45");numbersasString.add("45");numbersasString.add("45");numbersasString.add("45");numbersasString.add("45");
        numbersasString.add("450");numbersasString.add("45");numbersasString.add("45");numbersasString.add("45");


        System.out.println(numbersasString.stream()
                .filter(d->isValidNumber(d)).mapToInt(Integer::parseInt).min().orElse(0));


//Working
        System.out.println(numbersasString.stream().mapToInt(s->{
            try{
                return Integer.parseInt(s);
            }catch(NumberFormatException e){
                return 0;
            }
        }).min().orElse(0));

    }
    private static boolean isValidNumber(String e){
        try{
            Integer.parseInt(e);
            return true;
        }catch (NumberFormatException s){
            return false;
        }
    }
    private static void findminvalueByusingHashmap() {
    }

    private static void findminvalueByusingSet() {
    }
}
