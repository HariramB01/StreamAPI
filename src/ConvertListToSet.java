import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertListToSet {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,89,30,53,10,89,30,53,123,2351,1251,1357,12,11,90);
        Set<Integer> convertToListToSet = nums.stream().collect(Collectors.toSet());
        System.out.println(convertToListToSet.toString());
    }
}
