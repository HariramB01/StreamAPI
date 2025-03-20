import java.util.Arrays;
import java.util.List;

public class FindFirstElement {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,10,89,30,53,123,2351,1251,1357,12,11,90);
        int firstElement = nums.stream().findFirst().orElseThrow();
        System.out.println(firstElement);
    }
}
