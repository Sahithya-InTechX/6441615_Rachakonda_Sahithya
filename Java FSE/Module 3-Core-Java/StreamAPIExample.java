import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 9, 20, 33, 8);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);
    }
}
