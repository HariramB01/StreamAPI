import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PartitioningListOfList {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Java", "Python"),
                Arrays.asList("C++", "C#"),
                Arrays.asList("Go", "Rust")
        );

        List<String> result = nestedList.stream().flatMap(Collection::stream).collect(Collectors.toList());
    }
}
