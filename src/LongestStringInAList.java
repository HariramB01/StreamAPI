import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestStringInAList {
    public static void main(String[] args) {
        List<String> sentence = Arrays.asList("I", "am", "hariram", "Working", "as", "a", "Java", "developer");
        String longestString = sentence.stream().max(Comparator.comparingInt(String::length)).orElse("None");
        System.out.println(longestString);
    }
}
