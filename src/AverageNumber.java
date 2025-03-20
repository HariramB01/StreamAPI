import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageNumber {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,89,30,53,123,2351,1251,1357,12,11,90);
//        int num = nums.stream().reduce(Integer::intValue).
        double num = nums.stream().mapToInt(Integer::intValue).average().orElseThrow();
        System.out.println(num);
    }
}
