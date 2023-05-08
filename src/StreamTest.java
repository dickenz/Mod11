import java.util.Arrays;
import java.util.stream.Stream;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
        //Завдання 1
        String[] namesArray = {"John", "Ada", "Bill", "Julie", "Nika"};
        String names = Arrays.stream(namesArray)
                .filter(name -> Arrays.asList(namesArray).indexOf(name) % 2 != 0)
                .map(name -> name.trim().split(" ")[0])
                .collect(Collectors.joining(", "));

        System.out.println(names);
        System.out.println();

        //Завдання 2
        Stream<String> nameSorted = Arrays.stream(namesArray)
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder());

        nameSorted.forEach(System.out::println);
        System.out.println();

        //Завдання 3
        String[] arr = {"1, 2, 0, 100", "4, 5", "22, 11, 33"};
        String numbers = Arrays.stream(arr)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(numbers);
        
    }
}
