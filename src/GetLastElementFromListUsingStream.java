import java.util.Arrays;
import java.util.List;

public class GetLastElementFromListUsingStream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,89,30,53,123,2351,1251,1357,12,11,90,1);
        int result = nums.stream()
                .reduce((first,second)->second)
                .orElse(null);
        System.out.println(result);
    }
}
