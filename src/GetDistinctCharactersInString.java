import java.util.List;
import java.util.stream.Collectors;

public class GetDistinctCharactersInString {
    public static void main(String[] args) {
        String word = "programming";
        List<Character> chars = word.chars().mapToObj(c -> (char)c).distinct().collect(Collectors.toList());
        System.out.println(chars);
    }
}
