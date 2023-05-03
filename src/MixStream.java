import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MixStream {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = first.toList();
        List<T> secondList = second.toList();

        List<T> result = new ArrayList<>();

        int size = Math.min(firstList.size(), secondList.size());

        IntStream.range(0, size)
                .forEachOrdered(i -> {
                    result.add(firstList.get(i));
                    result.add(secondList.get(i));
                });

        return result.stream();
    }

    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(1, 2, 3);
        Stream<Integer> second = Stream.of(4, 5, 6, 7);

        Stream<Integer> result = zip(first, second);

        result.forEach(System.out::println);
    }
}
