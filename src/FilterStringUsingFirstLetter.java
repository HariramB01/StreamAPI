import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringUsingFirstLetter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hari","I","am","hello","Java", "developer", "How", "are", "you","uh");
        List<String> result = list.stream()
//                .filter(s->s.toLowerCase().contains("h"))
                .filter(s->s.toLowerCase().startsWith("h"))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
