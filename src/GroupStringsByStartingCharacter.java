import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByStartingCharacter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("I","am","Hariram","working","As","a","Java","developer","Seeking","for","job");
        Map<Character,List<String>> result = words.stream()
                .collect(Collectors.groupingBy(s -> s.toLowerCase().charAt(0)));

        System.out.println(result);

    }
}
