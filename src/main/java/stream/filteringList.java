package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filteringList {
    public static List<String> nameFiltering() {
        List<String> names = Arrays.asList("Emet", "Turghun", "Ehet", "Naman");
        List<String> longName = names.stream()
                .filter(name -> name.length() > 4)
                .collect(Collectors.toList());
        return longName;
    }
    public static List<String> filteringAge() {
        List<Integer> ages = Arrays.asList(23, 24, 35, 67);
        List<String> longAge = ages.stream()
                .filter(age -> age > 30)
                .map(age -> age > 60 ? "Old" : age.toString())
                .collect(Collectors.toList());
        return longAge;
    }

    public static List<Integer> filteringAgeList (List<Integer> ages, int thereHold){
        List<Integer> filterAge = ages.stream()
                .filter(age -> age > thereHold)
                .map(age -> age > 60 ? age: age.compareTo(40))
                .collect(Collectors.toList());
        return filterAge;
    }
    public static void main(String[] args) {
        System.out.println("longName = " + nameFiltering());
        System.out.println("longAge = " + filteringAge());
        System.out.println(filteringAgeList(List.of(34,56,13,67,89),80));

    }

}
