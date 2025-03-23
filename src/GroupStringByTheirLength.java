import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringByTheirLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("I", "am", "hariram", "working", "as", "a", "java", "developer");

        // Group strings by their length
        Map<Integer, List<String>> result = list.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("Grouped by length:");
        result.forEach((len, output)->{
            System.out.println("Length "+len+":");
            output.forEach(s->System.out.println("Value: "+ s));
        });

        // Sort by values (number of strings in each group)
        System.out.println("\nSorted by value (List size):");
        result.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e1.getValue().size(), e2.getValue().size()))
                .forEach(System.out::println);

        // Sort by keys (length)
        System.out.println("\nSorted by key (length):");
        result.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        // Sum of all values (total number of words)
        int total = result.values().stream()
                .mapToInt(List::size)
                .sum();
        System.out.println("\nTotal number of words: " + total);

    }
}
