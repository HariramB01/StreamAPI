import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitTo5 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,89,30,53,123,2351,1251,1357,12,11,90);
        List<Integer> limitTo5 = nums.stream().limit(5).collect(Collectors.toList());
        System.out.println(limitTo5.toString());
    }
}
