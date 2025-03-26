import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseListUsingStream {
    public static void main(String[] args) {
        String sentence = "I am hariram Working as a Java developer";
        List<String> result = Arrays.stream(sentence.split(" ")).toList();
        IntStream.range(0,result.size())
                .mapToObj(i->result.get(result.size()-i-1))
                .forEach(System.out::println);
    }
}
