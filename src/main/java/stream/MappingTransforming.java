package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingTransforming {
    public static List<Integer> squareNumber() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squareNumber = numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
        return squareNumber;
    }

    public static void main(String[] args) {
        System.out.println(squareNumber());  //[1, 4, 9, 16, 25]
    }
}
