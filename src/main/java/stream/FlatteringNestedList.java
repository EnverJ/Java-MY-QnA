package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatteringNestedList {
    //Flattening Nested Lists: Flattening a stream of lists into a single stream.
    static List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1,2), Arrays.asList(3,4));
    public static List<Integer> Flattened() {
        List<Integer> flattenedList = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        return flattenedList;
    }

    public static void main(String[] args) {
        System.out.println("FlatteringNestedList: "+Flattened());
        //FlatteringNestedList: [1, 2, 3, 4]
    }
}
