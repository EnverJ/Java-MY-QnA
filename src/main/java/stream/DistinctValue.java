package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctValue {
    static List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,7,6,5);
    public static List<Integer> distinctNum() {
        List<Integer> distinct = numbers.stream()
         //       .filter(num -> num % 2 !=0)
                .distinct()
                .collect(Collectors.toList());
        return distinct;
    }

    public static void main(String[] args) {
        System.out.println("distinctValue is = " + distinctNum());
        //distinctValue is = [1, 2, 3, 4, 5, 6, 7]
    }
}
