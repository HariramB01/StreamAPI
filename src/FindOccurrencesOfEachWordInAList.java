import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccurrencesOfEachWordInAList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("I", "am", "hariram", "am", "java", "working", "as", "a", "java", "developer");
        list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                )).forEach((key, value)->System.out.println(key +"                   "+value));


    }
}
