
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.Comparator;
//import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
        //Завдання 1
        String[] namesArray = {"John", "Ada", "Bill", "Julie", "Nika"};
        Stream<String> names = Arrays.stream(namesArray)
                .filter(name -> Arrays.asList(namesArray).indexOf(name) % 2 != 0)
                .map(name -> name.trim().split(" ")[0]);

        names.forEach(System.out::println);
        System.out.println();

        //Завдання 2
        Stream<String> nameSorted = Arrays.stream(namesArray)
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder());

        nameSorted.forEach(System.out::println);
        System.out.println();

        //Завдання 3
        String[] arr = {"1, 2, 0, 100", "4, 5", "22, 11, 33"};
        int[] numbers = Arrays.stream(arr)
                .flatMapToInt(s -> Arrays.stream(s.split(", ")).mapToInt(Integer::parseInt))
                .sorted()
                .toArray();

        System.out.println(Arrays.toString(numbers));
    }
}


