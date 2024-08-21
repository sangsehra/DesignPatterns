package Tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DelloiteTest {
    public static void main(String[] args) {
        /*

        input = 10,15,24,45
        integer starts with one
         */
        List<Integer> integerList = Arrays.asList(10,15,24,45);
        List<Integer> reslist =  integerList.stream().filter(var->String.valueOf(var).startsWith("1")).collect(Collectors.toList());
        System.out.println(reslist);

    }
}
