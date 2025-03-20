import java.util.Arrays;
import java.util.List;

public class MaxInteger {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,89,30,53,123,2351,1251,1357,12,11,90);
        int maxNum = nums.stream().max(Integer::compareTo).orElse(0);
        System.out.println(maxNum);
    }
}
