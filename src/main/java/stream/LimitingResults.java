package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitingResults {
    //Limiting Results: Limiting the number of elements in a stream.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        List<Integer>  firstThree = numbers.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("firstThree = " + firstThree);

        //firstThree = [1, 2, 3]
    }
}
