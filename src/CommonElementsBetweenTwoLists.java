import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CommonElementsBetweenTwoLists {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("I", "am", "hariram", "working", "as", "a", "java", "developer");
        List<String> list2 = Arrays.asList("I","Love","Hariram");

        System.out.println("Without Using IgnoreCase");

        list1.stream()
                .filter(list2::contains)
                .forEach(System.out::println);

        System.out.println("Using IgnoreCase");

        list1.stream()
                        .filter(item -> list2.stream()
                                .map(String::toLowerCase)
                                .anyMatch(s->s.equalsIgnoreCase(item))
                        )
                                .forEach(System.out::println);

        System.out.println("Printing non Common elements ");

        Stream.concat(
                list1.stream().filter(word1 -> !list2.contains(word1)),
                list2.stream().filter(word2->!list1.contains(word2))
        ).forEach(System.out::println);

    }
}
