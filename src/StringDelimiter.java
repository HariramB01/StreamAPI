import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringDelimiter {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,89,30,53,123,2351,1251,1357,12,11,90);
        String result = list.stream()
                .map(String::valueOf)
//                .collect(Collectors.joining(", "));
//                .collect(Collectors.joining(", "," [ ","]"));
                .collect(Collectors.joining("--> "," [ ","]"));
        System.out.println(result);
    }
}
