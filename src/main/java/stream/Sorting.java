package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    static  List<String> names = Arrays.asList("Josh", "Jack", "Jan", "Adam", "Steve");
    public static List<String> sortNames() {
        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());
        return sortedNames;

    }

    public static void main(String[] args) {
        System.out.println("sorted values = " + sortNames());
    }

}
