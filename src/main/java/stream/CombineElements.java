package stream;

import java.util.Arrays;
import java.util.List;

public class CombineElements {
    //Concatenating elements in a stream into a single result.
    static List<String> words = Arrays.asList("Hello", "World", "!!!");
    public static String combinedValue() {
        String hw = words.stream()
                .reduce("",(partialResult, word) -> partialResult + word );
        return hw;
    }

    public static void main(String[] args) {
        System.out.println("Combined words: " + combinedValue());
    }
}
