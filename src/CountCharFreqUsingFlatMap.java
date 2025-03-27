import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharFreqUsingFlatMap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello", "java");
        Map<String, Long> charFreq = list.stream()
                        .flatMap((s)->Arrays.stream(s.split("")))
                                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(charFreq);
    }
}
