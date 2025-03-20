import java.util.Arrays;
import java.util.List;

public class CountElements {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,89,30,53,123,2351,1251,1357,12,11,90);
        long countElement = nums.stream().count();
        System.out.println(countElement);
    }
}
