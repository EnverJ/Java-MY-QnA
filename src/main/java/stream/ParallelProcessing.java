package stream;

import java.util.Arrays;
import java.util.List;

public class ParallelProcessing {
    //Parallel Processing: Using parallel streams for concurrent processing.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum = numbers.stream()
                .reduce(0,Integer::sum);
        System.out.println("sum = " + sum);
        //sum = 55
    }
}
