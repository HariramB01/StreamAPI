import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveNull {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(null,10,89,30,53,123,2351,1251,1357,12,11,90);
        List<Integer> removeNull = nums.stream().filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(removeNull);
    }
}
