import java.util.Arrays;
import java.util.List;

public class MinInteger {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,89,30,53,123,2351,1251,1357,12,11,90);
        int minNum = nums.stream().min(Integer::compareTo).orElseThrow();
        System.out.println(minNum);
    }
}
