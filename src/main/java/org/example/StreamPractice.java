package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(3,4,56,2,5,2,35,66);
        integerList.stream().max(Integer::compare)
                .filter(i->i>10)
               .map(Integer::doubleValue)
                .ifPresent(System.out::println);


    }

}
