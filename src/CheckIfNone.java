import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CheckIfNone {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,89,30,53,123,2351,1251,1357,12,11,90, null);
        boolean checkIfNone = nums.stream().noneMatch(Objects::isNull);
        System.out.println(checkIfNone);
    }
}
