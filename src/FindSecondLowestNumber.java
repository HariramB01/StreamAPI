import java.util.Arrays;
import java.util.List;

public class FindSecondLowestNumber {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,89,30,53,123,2351,1251,1357,12,11,90,1);
        int result = nums.stream()
                .sorted()
                .distinct()
                .skip(1)
                .findFirst()
                .orElseThrow();
        System.out.println(result);
    }
}
