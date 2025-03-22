import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringByTheirLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("I", "am", "hariram", "working", "as", "a", "java", "developer");
        Map<Integer, List<String>> result = list.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(result);
    }
}
