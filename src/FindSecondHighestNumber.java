import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindSecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,89,30,53,123,2351,1251,1357,12,11,90);
//        int result = nums.stream().sorted().collect(Collectors.toList()).get(nums.size()-2);
        int result = nums.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst()
                .orElseThrow();
        System.out.println(result);
    }
}
