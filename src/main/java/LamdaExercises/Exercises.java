package LamdaExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercises {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(8);
        numbers.add(8);
        numbers.add(1);
        order(numbers);

    }

    //The lambda expression must print if a number is odd or  if it is even.
    static public void isOddisPrime(ArrayList<Integer> numbers)
    {
        numbers.forEach(x -> System.out.println( x%2 == 0 ? x + " is pair" : x + " is odd"));
    }

    //Get repeated
    static public void getRepeated(ArrayList<Integer> numbers)
    {
        List<Integer> result = numbers.stream().filter(x -> Collections.frequency(numbers, x) > 1)
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }

    //The lambda expression must print numbers max than 5
    static public void another(ArrayList<Integer> numbers)
    {
        ArrayList<Integer> result = (ArrayList<Integer>) numbers.stream().filter(x -> x > 5).collect(Collectors.toList());
    }

    //Get elements count
    static public void count(ArrayList<Integer> numbers) {
        long x = numbers.stream().count();
        System.out.println("Count: " + x);
    }

    //Sort
    static public void order(ArrayList<Integer> numbers) {
        System.out.println("Ordered");
        numbers.stream().sorted((x,y) -> x.compareTo(y)).forEach(System.out::println);
    }

    //Limit
    static public void limit(ArrayList<Integer> numbers, int limit) {
        System.out.println("Limit " + limit);
        numbers.stream().limit(limit).forEach(System.out::println);
    }

    //Transform items to string
    static public void limit(ArrayList<Integer> numbers) {
        List<String> result = numbers.stream().map(x -> String.valueOf(x) + 1).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
