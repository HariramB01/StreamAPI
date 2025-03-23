import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFreqInString {
    public static void main(String[] args) {
        String word = "programming";
        Map<Character,Long> frequency = word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(frequency);
    }
}
