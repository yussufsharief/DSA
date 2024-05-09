package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseIntArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 1, 7, 3, 9, 6, 6};

        System.out.println(Arrays.toString(IntStream.rangeClosed(1, array.length).map(i -> array[array.length - i]).toArray()));
        Stream.of(1, 4, 2, 5)
                .sorted(Comparator.reverseOrder());
        int[] array1 = Arrays.stream(array).sorted().toArray();

        int[] array2 = IntStream.rangeClosed(1, array1.length).map(i -> array1[array1.length - i]).toArray();
        List<Integer> numbers= Arrays.asList(3,2,5,1,9);
        numbers.stream().mapToInt(v->v).max().getAsInt();
        Arrays.stream(array2).boxed().collect(Collectors.groupingBy(s->s,Collectors.counting()));
        System.out.println(Arrays.stream(array2).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.groupingBy(s -> s, Collectors.counting())));
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        listOfStrings.stream().distinct().collect(Collectors.toList()).forEach(str -> System.out.println(str));
        String[][] fltarray = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        // Java 8
        String[] result = Stream.of(fltarray)  // Stream<String[]>
                .flatMap(Stream::of)        // Stream<String>
                .toArray(String[]::new);    // [a, b, c, d, e, f]

        for (String s : result) {
            System.out.println(s);
        }
        List<String> collect = Stream.of(fltarray)     // Stream<String[]>
                .flatMap(Stream::of)                // Stream<String>
                .filter(x -> !"a".equals(x))        // filter out the a
                .collect(Collectors.toList());      // return a List

        collect.forEach(System.out::println);
    }

}
