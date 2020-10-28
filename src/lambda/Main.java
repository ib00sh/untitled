package lambda;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
//        Operation<Integer> addition = ((value1, value2) -> value1 + value2);
//        System.out.println(addition.getResult(2,2));
//
//        Operation<String> concatenation = ((value1, value2) -> value1 + value2);
//        System.out.println(concatenation.getResult("2", "2"));

        Predicate<Integer> isZero = value -> value == 0;
        System.out.println(isZero.test(4));
        System.out.println(isZero.test(0));

        Consumer<String> printer = string -> System.out.println(string);
        printer.accept("hello wotrld!");


    }
}
