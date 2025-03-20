import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipFirst3 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,89,30,53,123,2351,1251,1357,12,11,90);
        List<Integer> skipFirst3 = nums.stream().skip(3).collect(Collectors.toList());
        System.out.println(skipFirst3);
    }
}
