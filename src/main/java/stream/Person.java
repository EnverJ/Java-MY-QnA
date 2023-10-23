package stream;

import lombok.Getter;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Person {
//Grouping and Aggregating: Grouping and aggregating elements based on a property.
    private String name;
    @Getter
    private int age;
    @Getter
    private String city;
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Adil", 34, "Ghulja"),
                new Person("Alim", 24, "Kashgar"),
                new Person("Dawut", 4, "Ghulja"),
                new Person("Kasim", 5, "Kashgar")
        );
        Map<String, Double> averageAgeByCity = people.stream()
                .collect(Collectors.groupingBy(Person::getCity, Collectors.averagingInt(Person::getAge)));
        System.out.println("averageAgeByCity = " + averageAgeByCity);
        //averageAgeByCity = {Kashgar=14.5, Ghulja=19.0}
    }
}
