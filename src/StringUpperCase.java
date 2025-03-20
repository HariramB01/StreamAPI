import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("hari", "harish", "hariram");
        List<String> name = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(name.toString());
    }
}
