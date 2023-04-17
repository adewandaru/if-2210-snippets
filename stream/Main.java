import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    // Demo of Stream API
    // 2 + 4 + 6 + 8 + 10 = 30
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> doubledNumbers = numbers.stream().map(n -> {
            System.out.println("Doubling " + n);
            return n * 2;
        });

        System.out.println("Stream created...");

        int sum = doubledNumbers.mapToInt(Integer::intValue).sum();
        System.out.println("Sum of doubled numbers: " + sum);
    }
}
