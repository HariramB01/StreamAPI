import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListOfList {
    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("Hello"),
                Arrays.asList("am", "Hariram"),
                Arrays.asList("Java","developer","at","wipro"),
                Arrays.asList("Working","as","a")
        );

        list.stream()
                .sorted((l1,l2)-> l2.size()- l1.size())
                .forEach(System.out::println);

        System.out.println("-----------");
        list.stream()
                .sorted((l1,l2)-> l1.size()- l2.size())
                .forEach(System.out::println);

        System.out.println("-----------");
        list.stream()
                .sorted(Comparator.comparing(List::size))
                .forEach(System.out::println);

    }
}
