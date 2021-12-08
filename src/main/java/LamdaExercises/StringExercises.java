package LamdaExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StringExercises {

    public static void main(String[] args) {
        String countries[] = new String[]{"Mexico", "Francia", "Colombia", "China", "Japon", "Argentina"};
        List<String> countriesList = mapToList(countries);
        multipleOps(countriesList);
    }

    //Map to list
    static List<String> mapToList(String countries[]){
        //List<String> aCountries = Arrays.stream(countries).map(x -> x).collect(Collectors.toList());
        return Arrays.asList(countries);
    }

    //Convert to upper case
    static void toUpperCase(List<String> countries)
    {
        List<String> result = countries.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        result.forEach(System.out::println);
    }

    //Multiple functions
    static void multipleOps(List<String> countries){
        countries.stream().map(x -> x.toLowerCase())
                .sorted()
                .filter(x -> x.startsWith("a") || x.startsWith("j"))
                .forEach(System.out::println);
    }
}