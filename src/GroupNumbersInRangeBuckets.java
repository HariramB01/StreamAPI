import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupNumbersInRangeBuckets {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,89,30,53,123,2351,1251,1357,12,11,90);
        Map<String, List<Integer>> grouped = list.stream()
                .collect(Collectors.groupingBy(i -> {
                    if (i <= 10) return "0-10";
                    else if (i <= 20) return "11-20";
                    else return "21+";
                }));

        grouped.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
