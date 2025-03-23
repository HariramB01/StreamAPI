import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListByStringLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("I","am","Hariram","working","As","a","Java","developer","Seeking","for","job");
        words.sort(Comparator.comparing(String::length));
        List<String> result = words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
