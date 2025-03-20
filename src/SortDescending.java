import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDescending {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,89,30,53,123,2351,1251,1357,12,11,90);
        List<Integer> sortDesc = nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortDesc.toString());
    }
}
