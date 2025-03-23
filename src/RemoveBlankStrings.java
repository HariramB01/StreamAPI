import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveBlankStrings {
    public static void main(String[] args) {
        List<String> people = List.of("","a"," ","Alice", "Bob", "Charlie", "David", "Eve","");

        people.stream().filter(s->s!=null && s.trim().isEmpty()).forEach(System.out::println);
        System.out.println("--------");
        List<String> cleaned = people.stream()
                .filter(s -> s != null && !s.trim().isEmpty())
                .collect(Collectors.toList());
        cleaned.forEach(System.out::println);
    }
}
