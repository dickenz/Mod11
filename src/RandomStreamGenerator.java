import java.util.stream.Stream;

public class RandomStreamGenerator {
    public static Stream<Long> generateRandomStream(long seed, long a, long c, long m) {
        return Stream.iterate(seed, n -> (a * n + c) % m);
    }

    public static void main(String[] args) {
        Stream<Long> randomStream = RandomStreamGenerator.generateRandomStream
                (1234L, 25214903917L, 11L, (long) Math.pow(2, 48));
        randomStream.limit(10).forEach(System.out::println);
    }
}
