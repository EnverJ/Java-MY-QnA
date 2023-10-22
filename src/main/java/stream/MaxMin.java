package stream;

import java.util.Arrays;
import java.util.List;

public class MaxMin {
    static List<Integer> value = Arrays.asList(12, 34, 57, 87);
    public static int maxValue() {
        int max = value.stream()
                .max(Integer::compareTo)
                .orElse(0);
        return max;
    }
    public static int minValue() {
        int min = value.stream()
                .min(Integer::compareTo)
                .orElse(0);
        return min;
    }

    public static void main(String[] args) {
        System.out.println("max = " + maxValue());
        System.out.println("min = " + minValue());


    }


}
